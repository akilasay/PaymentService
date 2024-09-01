package com.ak.payment.exceptionHandler;

/**
 * The type Error response.
 */
public class ErrorResponse {
    private int status;
    private String message;

    /**
     * Instantiates a new Error response.
     *
     * @param status  the status
     * @param message the message
     */
    public ErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getters and setters
}
