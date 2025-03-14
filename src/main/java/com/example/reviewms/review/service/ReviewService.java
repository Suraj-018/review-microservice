package com.example.reviewms.review.service;


import com.example.reviewms.review.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> findAllReviews(Long companyId);

    Review findReviewById(Long id);

    boolean addReview(Review review, Long companyId);

    boolean updateReview(Review review, Long id);

    boolean deleteReview(Long id);
}
