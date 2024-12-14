package com.rohan.jobApp.review;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public class ReviewRepository extends JpaRepository<Review , Long> {

    public List<Review> findByCompanyId(Long companyId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCompanyId'");
    }
    
}
