package com.ak.payment;

import com.ak.payment.exceptionHandler.GlobalExceptionHandler;
import com.ak.payment.model.PaymentRequest;
import com.ak.payment.model.PaymentResponse;
import com.ak.payment.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The type Payment controller.
 */
@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);


    /**
     * Instantiates a new Payment controller.
     *
     * @param paymentService the payment service
     */
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    /**
     * Create payment response entity.
     *
     * @param paymentRequest the payment request
     * @return the response entity
     */
    @PostMapping
    public ResponseEntity<PaymentResponse> createPayment(@RequestBody PaymentRequest paymentRequest) {
        logger.debug("Creating a payment for {} ",paymentRequest.getCardNumber());

        PaymentResponse paymentResponse = paymentService.processPayment(paymentRequest);
        return new ResponseEntity<>(paymentResponse, HttpStatus.CREATED);
    }


    /**
     * Gets payment status.
     *
     * @param transactionId the transaction id
     * @return the payment status
     */
    @GetMapping("/{transactionId}")
    public PaymentResponse getPaymentStatus(@PathVariable String transactionId) {
        logger.debug("Fetching the payment status for transaction ID {} ",transactionId);
        return paymentService.getPaymentStatus(transactionId);
    }
}
