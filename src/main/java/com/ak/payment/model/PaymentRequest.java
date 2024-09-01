package com.ak.payment.model;

/**
 * The type Payment request.
 */
public class PaymentRequest {

    private double amount;
    private String currency;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    /**
     * Gets amount.
     *
     * @return the amount
     */
// Getters and setters
    public double getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets card number.
     *
     * @return the card number
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets card number.
     *
     * @param cardNumber the card number
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Gets expiry date.
     *
     * @return the expiry date
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets expiry date.
     *
     * @param expiryDate the expiry date
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Gets cvv.
     *
     * @return the cvv
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets cvv.
     *
     * @param cvv the cvv
     */
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
