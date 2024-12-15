package com.rohan.jobApp.review;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohan.jobApp.company.Company;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByCompanyId(Long companyId);

    void save(Company company);
}

