package com.example.reviewms.review.service;

import com.example.reviewms.review.entity.Review;
import com.example.reviewms.review.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> findAllReviews(Long companyId) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyId);
        return reviews;
    }

    @Override
    public Review findReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public boolean addReview(Review review, Long companyId) {
        if(companyId != null && review != null){
            review.setCompanyId(companyId);
            reviewRepository.save(review);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateReview(Review review, Long id) {
        Optional<Review> existingReview = reviewRepository.findById(id);

        if(existingReview.isPresent()){
            Review currentReview = existingReview.get();
            currentReview.setTitle(review.getTitle());
            currentReview.setDescription(review.getDescription());
            currentReview.setRating(review.getRating());
            currentReview.setCompanyId(review.getCompanyId());

            reviewRepository.save(currentReview);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteReview(Long id) {
        if(reviewRepository.existsById(id)){
            reviewRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
