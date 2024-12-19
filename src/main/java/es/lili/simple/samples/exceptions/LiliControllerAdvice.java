package es.lili.simple.samples.exceptions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import es.lili.simple.samples.exceptions.ex4xx.LiliNotFoundException;
import es.lili.simple.samples.exceptions.model.LiliErrorModel;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

import java.util.Locale;

@Order(-2)
@ControllerAdvice
@RequiredArgsConstructor
public class LiliControllerAdvice {

    private final MessageSource messageSource;

    private final static ObjectMapper mapper = new ObjectMapper();

//    @ExceptionHandler(LiliGenericException.class)
//    public Mono<ResponseEntity<LiliErrorModel>> handleLiliGenericException(LiliGenericException ex, Locale locale) {
//        var errorBody = buildLiliErrorModel(ex, locale);
//        return Mono.just(ResponseEntity.status(ex.getStatus()).body(errorBody));
//    }

    @ExceptionHandler(LiliGenericException.class)
    public ProblemDetail handleLiliGenericException(LiliGenericException ex, Locale locale) {
        var errorBody = buildLiliErrorModel(ex, locale);
        var det = ProblemDetail.forStatusAndDetail(ex.getStatus(), ex.getInternalCode());
        det.setProperty("error", errorBody);
        return det;
    }

    private String writeErrorBody(LiliErrorModel errorBody) {
        try {
            return mapper.writeValueAsString(errorBody);
        } catch (JsonProcessingException e) {
            return errorBody.getDescription();
        }
    }

    private LiliErrorModel buildLiliErrorModel(LiliGenericException ex, Locale locale) {
        var errorName = messageSource.getMessage(ErrorKeyMsg.buildKeyName(ex.getInternalCode()), null, locale);
        var errorDesc = messageSource.getMessage(ErrorKeyMsg.buildKeyDesc(ex.getInternalCode()), null, locale);
        var errorShortMsg = messageSource.getMessage(ErrorKeyMsg.buildKeyMsg(ex.getInternalCode()), null, locale);
        return LiliErrorModel.builder()
                .code(ex.getInternalCode())
                .name(errorName)
                .description(errorDesc)
                .shortMessage(errorShortMsg)
                .httpStatus(ex.getStatus())
                .exceptionMessage(ex.getCause() == null ? StringUtils.EMPTY : ex.getCause().getMessage())
                .build();
    }

}
