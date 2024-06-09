package dev.sid.devbar_backend.service;

import dev.sid.devbar_backend.entity.Review;
import dev.sid.devbar_backend.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    public Review saveReview(Review review){
        return reviewRepository.save(review);
    }

    public List<Review> findReviewByDrinkId(int drink_id) {
        return reviewRepository.findReviewByDrinkId(drink_id);
    }
}
