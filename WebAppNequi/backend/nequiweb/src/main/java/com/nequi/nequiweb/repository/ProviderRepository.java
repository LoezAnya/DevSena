package com.nequi.nequiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nequi.nequiweb.entity.ProviderNequi;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<ProviderNequi, String> {
    List<ProviderNequi> findByBusinessNameContaining(String businessName);
    boolean existsByProviderNit(String providerNit);
}