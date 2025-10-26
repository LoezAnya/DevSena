package com.nequi.nequiweb.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nequi.nequiweb.entity.Movement;

@Repository
public interface MovementRepository extends JpaRepository<Movement, Integer> {
    List<Movement> findByTransactionTransactionId(Integer transactionId);
    List<Movement> findByPurchaseId(Integer purchaseId);
    List<Movement> findByPaymentId(Integer paymentId);
}
