package exception;

public class InvalidIdsException extends RuntimeException {
    public InvalidIdsException() {
    }

    public InvalidIdsException(String message) {
        super(message);
    }

    public InvalidIdsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIdsException(Throwable cause) {
        super(cause);
    }

    public InvalidIdsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
