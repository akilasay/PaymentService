package com.ak.payment.model;

/**
 * The type Payment response.
 */
public class PaymentResponse {

    private String transactionId;
    private String status;

    /**
     * Instantiates a new Payment response.
     *
     * @param transactionId the transaction id
     * @param status        the status
     */
    public PaymentResponse(String transactionId, String status) {
        this.transactionId = transactionId;
        this.status = status;
    }

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
// Getters and setters
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
