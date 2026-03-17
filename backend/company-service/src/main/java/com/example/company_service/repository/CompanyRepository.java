package com.example.company_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.company_service.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    boolean existsByShortId(String shortID);

    Company findByShortId(String shortID);

    void deleteByShortId(String shortID);
}
