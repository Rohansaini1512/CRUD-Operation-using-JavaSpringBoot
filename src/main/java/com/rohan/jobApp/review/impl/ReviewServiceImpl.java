package com.rohan.jobApp.review.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rohan.jobApp.review.Review;
import com.rohan.jobApp.review.ReviewRepository;
import com.rohan.jobApp.review.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService{
    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews(Long companyId){
        List<Review>reviews = reviewRepository.findByCompanyId(companyId);
        return reviews;
    }

}