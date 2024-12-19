package es.lili.simple.samples.exceptions.ex5xx;

import es.lili.simple.samples.exceptions.ErrorKeyMsg;
import es.lili.simple.samples.exceptions.LiliGenericException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LiliInternalServerErrorException extends LiliGenericException {
    public LiliInternalServerErrorException(String message, Throwable ex) {
        super(message, ex, HttpStatus.INTERNAL_SERVER_ERROR, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }
    public LiliInternalServerErrorException(Throwable ex) {
        super(ex, HttpStatus.INTERNAL_SERVER_ERROR, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }

    public LiliInternalServerErrorException(String internalCode) {
        super(internalCode, HttpStatus.INTERNAL_SERVER_ERROR, internalCode);
    }

    public LiliInternalServerErrorException(String message, Throwable ex, String internalCode) {
        super(message, ex, HttpStatus.INTERNAL_SERVER_ERROR, internalCode);
    }

    public LiliInternalServerErrorException(String message, String internalCode) {
        super(message, HttpStatus.INTERNAL_SERVER_ERROR, internalCode);
    }

    public LiliInternalServerErrorException(Throwable ex, String internalCode) {
        super(ex, HttpStatus.INTERNAL_SERVER_ERROR, internalCode);
    }
}
