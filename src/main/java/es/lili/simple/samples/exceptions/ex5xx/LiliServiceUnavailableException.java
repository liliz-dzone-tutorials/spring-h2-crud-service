package es.lili.simple.samples.exceptions.ex5xx;

import es.lili.simple.samples.exceptions.ErrorKeyMsg;
import es.lili.simple.samples.exceptions.LiliGenericException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LiliServiceUnavailableException extends LiliGenericException {

    public LiliServiceUnavailableException(String message, Throwable ex) {
        super(message, ex, HttpStatus.SERVICE_UNAVAILABLE, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }
    public LiliServiceUnavailableException(Throwable ex) {
        super(ex, HttpStatus.SERVICE_UNAVAILABLE, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }

    public LiliServiceUnavailableException(String internalCode) {
        super(internalCode, HttpStatus.SERVICE_UNAVAILABLE, internalCode);
    }

    public LiliServiceUnavailableException(String message, Throwable ex, String internalCode) {
        super(message, ex, HttpStatus.SERVICE_UNAVAILABLE, internalCode);
    }

    public LiliServiceUnavailableException(String message, String internalCode) {
        super(message, HttpStatus.SERVICE_UNAVAILABLE, internalCode);
    }

    public LiliServiceUnavailableException(Throwable ex, String internalCode) {
        super(ex, HttpStatus.SERVICE_UNAVAILABLE, internalCode);
    }
}
