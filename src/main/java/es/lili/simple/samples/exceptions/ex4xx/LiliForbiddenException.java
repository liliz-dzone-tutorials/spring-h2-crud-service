package es.lili.simple.samples.exceptions.ex4xx;

import es.lili.simple.samples.exceptions.ErrorKeyMsg;
import es.lili.simple.samples.exceptions.LiliGenericException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LiliForbiddenException extends LiliGenericException {
    public LiliForbiddenException(String message, Throwable ex) {
        super(message, ex, HttpStatus.FORBIDDEN, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }
    public LiliForbiddenException(Throwable ex) {
        super(ex, HttpStatus.FORBIDDEN, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }

    public LiliForbiddenException(String internalCode) {
        super(internalCode, HttpStatus.FORBIDDEN, internalCode);
    }

    public LiliForbiddenException(String message, Throwable ex, String internalCode) {
        super(message, ex, HttpStatus.FORBIDDEN, internalCode);
    }

    public LiliForbiddenException(String message, String internalCode) {
        super(message, HttpStatus.FORBIDDEN, internalCode);
    }

    public LiliForbiddenException(Throwable ex, String internalCode) {
        super(ex, HttpStatus.FORBIDDEN, internalCode);
    }
}
