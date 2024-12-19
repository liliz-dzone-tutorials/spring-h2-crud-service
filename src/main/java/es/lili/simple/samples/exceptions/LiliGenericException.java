package es.lili.simple.samples.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LiliGenericException extends RuntimeException {

    private final HttpStatus status;
    private final String internalCode;

    public LiliGenericException(String message, Throwable ex, HttpStatus status, String internalCode) {
        super(message, ex);
        this.status = status;
        this.internalCode = internalCode;
    }

    public LiliGenericException(String message, HttpStatus status, String internalCode) {
        super(message);
        this.status = status;
        this.internalCode = internalCode;
    }

    public LiliGenericException(Throwable ex, HttpStatus status, String internalCode) {
        super(ex);
        this.status = status;
        this.internalCode = internalCode;
    }

}
