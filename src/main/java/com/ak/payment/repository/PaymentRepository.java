package com.ak.payment.repository;

import com.ak.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * The interface Payment repository.
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    /**
     * Find by transaction id optional.
     *
     * @param transactionId the transaction id
     * @return the optional
     */
    Optional<Payment> findByTransactionId(String transactionId);
}
