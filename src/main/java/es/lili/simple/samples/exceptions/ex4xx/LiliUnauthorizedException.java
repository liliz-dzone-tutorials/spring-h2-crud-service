package es.lili.simple.samples.exceptions.ex4xx;

import es.lili.simple.samples.exceptions.ErrorKeyMsg;
import es.lili.simple.samples.exceptions.LiliGenericException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LiliUnauthorizedException extends LiliGenericException {

    public LiliUnauthorizedException(String message, Throwable ex) {
        super(message, ex, HttpStatus.UNAUTHORIZED, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }
    public LiliUnauthorizedException(Throwable ex) {
        super(ex, HttpStatus.UNAUTHORIZED, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }

    public LiliUnauthorizedException(String internalCode) {
        super(internalCode, HttpStatus.UNAUTHORIZED, internalCode);
    }

    public LiliUnauthorizedException(String message, Throwable ex, String internalCode) {
        super(message, ex, HttpStatus.UNAUTHORIZED, internalCode);
    }

    public LiliUnauthorizedException(String message, String internalCode) {
        super(message, HttpStatus.UNAUTHORIZED, internalCode);
    }

    public LiliUnauthorizedException(Throwable ex, String internalCode) {
        super(ex, HttpStatus.UNAUTHORIZED, internalCode);
    }
}
