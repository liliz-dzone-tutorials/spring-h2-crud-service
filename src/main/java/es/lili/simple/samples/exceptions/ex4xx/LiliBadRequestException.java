package es.lili.simple.samples.exceptions.ex4xx;

import es.lili.simple.samples.exceptions.ErrorKeyMsg;
import es.lili.simple.samples.exceptions.LiliGenericException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LiliBadRequestException extends LiliGenericException  {

    public LiliBadRequestException(String message, Throwable ex) {
        super(message, ex, HttpStatus.BAD_REQUEST, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }
    public LiliBadRequestException(Throwable ex) {
        super(ex, HttpStatus.BAD_REQUEST, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }

    public LiliBadRequestException(String internalCode) {
        super(internalCode, HttpStatus.BAD_REQUEST, internalCode);
    }

    public LiliBadRequestException(String message, Throwable ex, String internalCode) {
        super(message, ex, HttpStatus.BAD_REQUEST, internalCode);
    }

    public LiliBadRequestException(String message, String internalCode) {
        super(message, HttpStatus.BAD_REQUEST, internalCode);
    }

    public LiliBadRequestException(Throwable ex, String internalCode) {
        super(ex, HttpStatus.BAD_REQUEST, internalCode);
    }
}
