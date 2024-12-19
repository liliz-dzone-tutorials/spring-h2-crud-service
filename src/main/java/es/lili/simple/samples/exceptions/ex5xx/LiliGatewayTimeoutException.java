package es.lili.simple.samples.exceptions.ex5xx;

import es.lili.simple.samples.exceptions.ErrorKeyMsg;
import es.lili.simple.samples.exceptions.LiliGenericException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LiliGatewayTimeoutException extends LiliGenericException {
    public LiliGatewayTimeoutException(String message, Throwable ex) {
        super(message, ex, HttpStatus.GATEWAY_TIMEOUT, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }
    public LiliGatewayTimeoutException(Throwable ex) {
        super(ex, HttpStatus.GATEWAY_TIMEOUT, ErrorKeyMsg.UNDEFINED_NOT_FOUND);
    }

    public LiliGatewayTimeoutException(String internalCode) {
        super(internalCode, HttpStatus.GATEWAY_TIMEOUT, internalCode);
    }

    public LiliGatewayTimeoutException(String message, Throwable ex, String internalCode) {
        super(message, ex, HttpStatus.GATEWAY_TIMEOUT, internalCode);
    }

    public LiliGatewayTimeoutException(String message, String internalCode) {
        super(message, HttpStatus.GATEWAY_TIMEOUT, internalCode);
    }

    public LiliGatewayTimeoutException(Throwable ex, String internalCode) {
        super(ex, HttpStatus.GATEWAY_TIMEOUT, internalCode);
    }
}
