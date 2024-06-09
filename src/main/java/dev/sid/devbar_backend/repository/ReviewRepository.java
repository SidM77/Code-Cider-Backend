package dev.sid.devbar_backend.repository;

import dev.sid.devbar_backend.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

    @Query("FROM Review R where R.drink_id = ?1")
    List<Review> findReviewByDrinkId(int drink_id);
}
