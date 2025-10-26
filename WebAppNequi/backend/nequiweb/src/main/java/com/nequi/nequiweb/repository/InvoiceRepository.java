package com.nequi.nequiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nequi.nequiweb.entity.Invoice;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
    List<Invoice> findByAccountAccountId(Integer accountId);
    List<Invoice> findByServiceServiceId(Integer serviceId);
    List<Invoice> findByInvoiceValueGreaterThan(Double minValue);
}