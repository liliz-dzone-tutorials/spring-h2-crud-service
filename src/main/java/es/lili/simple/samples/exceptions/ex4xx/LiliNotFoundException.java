package es.lili.simple.samples.exceptions.ex4xx;

import es.lili.simple.samples.exceptions.ErrorKeyMsg;
import es.lili.simple.samples.exceptions.LiliGenericException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LiliNotFoundException extends LiliGenericException {

    public LiliNotFoundException(String message, Throwable ex) {
        super(message, ex, HttpStatus.NOT_FOUND, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }
    public LiliNotFoundException(Throwable ex) {
        super(ex, HttpStatus.NOT_FOUND, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }

    public LiliNotFoundException(String internalCode) {
        super(internalCode, HttpStatus.NOT_FOUND, internalCode);
    }

    public LiliNotFoundException(String message, Throwable ex, String internalCode) {
        super(message, ex, HttpStatus.NOT_FOUND, internalCode);
    }

    public LiliNotFoundException(String message, String internalCode) {
        super(message, HttpStatus.NOT_FOUND, internalCode);
    }

    public LiliNotFoundException(Throwable ex, String internalCode) {
        super(ex, HttpStatus.NOT_FOUND, internalCode);
    }
}
