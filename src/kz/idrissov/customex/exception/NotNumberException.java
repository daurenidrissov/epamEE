package kz.idrissov.customex.exception;

public class NotNumberException extends Exception {
    public NotNumberException() {
    }

    public NotNumberException(String message) {
        super(message);
    }

    public NotNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotNumberException(Throwable cause) {
        super(cause);
    }
}
