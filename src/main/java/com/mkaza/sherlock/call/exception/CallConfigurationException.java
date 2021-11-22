package com.mkaza.sherlock.call.exception;

public class CallConfigurationException extends RuntimeException {

    public CallConfigurationException(String message) {
        super(message);
    }

    public CallConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
