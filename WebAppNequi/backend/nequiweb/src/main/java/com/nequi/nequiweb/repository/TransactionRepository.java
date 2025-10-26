package com.nequi.nequiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nequi.nequiweb.entity.Transaction;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction> findBySenderAccountAccountId(Integer senderAccountId);
    List<Transaction> findByReceiverAccountAccountId(Integer receiverAccountId);

}
