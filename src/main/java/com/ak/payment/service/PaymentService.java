package com.ak.payment.service;

import com.ak.payment.exceptionHandler.ResourceNotFoundException;
import com.ak.payment.model.Payment;
import com.ak.payment.model.PaymentRequest;
import com.ak.payment.model.PaymentResponse;
import com.ak.payment.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * The type Payment service.
 */
@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    /**
     * Instantiates a new Payment service.
     *
     * @param paymentRepository the payment repository
     */
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    /**
     * Process payment payment response.
     *
     * @param paymentRequest the payment request
     * @return the payment response
     */
    public PaymentResponse processPayment(PaymentRequest paymentRequest) {
        // Generate a transaction ID
        String transactionId = UUID.randomUUID().toString();

        // Create a new Payment entity
        Payment payment = new Payment();
        payment.setTransactionId(transactionId);
        payment.setAmount(paymentRequest.getAmount());
        payment.setCurrency(paymentRequest.getCurrency());
        payment.setCardNumber(paymentRequest.getCardNumber());
        payment.setExpiryDate(paymentRequest.getExpiryDate());
        payment.setCvv(paymentRequest.getCvv());
        payment.setStatus("pending");
        payment.setCreatedAt(LocalDateTime.now());

        // Save the payment to the database
        paymentRepository.save(payment);

        // Return a response with the transaction ID
        return new PaymentResponse(transactionId, "pending");
    }

    /**
     * Gets payment status.
     *
     * @param transactionId the transaction id
     * @return the payment status
     */
    public PaymentResponse getPaymentStatus(String transactionId) {
        // Retrieve the payment from the database
        final Payment payment = paymentRepository.findByTransactionId(transactionId)
                .orElseThrow(() -> new ResourceNotFoundException("Payment is not found for give transaction ID : "+transactionId));

        // Return the payment status
        return new PaymentResponse(payment.getTransactionId(), payment.getStatus());
    }
}
