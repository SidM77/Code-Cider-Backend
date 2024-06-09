package dev.sid.devbar_backend.controller;

import dev.sid.devbar_backend.entity.Review;
import dev.sid.devbar_backend.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }

    @PostMapping("/addReview")
    public Review addReview(@RequestBody Review review){
        return reviewService.saveReview(review);
    }

    @GetMapping("/getReviewsByDrinkId/{drink_id}")
    public List<Review> getReviewsByDrinkId(@PathVariable int drink_id){
        System.out.println("In controller");
        return reviewService.findReviewByDrinkId(drink_id);
    }
}
