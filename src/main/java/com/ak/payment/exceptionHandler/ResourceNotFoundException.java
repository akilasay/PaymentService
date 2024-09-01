package com.ak.payment.exceptionHandler;

/**
 * The type Resource not found exception.
 */
public class ResourceNotFoundException extends RuntimeException {
    /**
     * Instantiates a new Resource not found exception.
     *
     * @param message the message
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

