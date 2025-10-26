package com.nequi.nequiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nequi.nequiweb.entity.Service;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
    List<Service> findByProviderProviderNit(String providerNit);
    List<Service> findByValueBetween(Double minValue, Double maxValue);
}