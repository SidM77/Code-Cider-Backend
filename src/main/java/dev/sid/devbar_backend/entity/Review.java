package dev.sid.devbar_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "REVIEW_TABLE")
public class Review {
    @Id
    @GeneratedValue
    private int id;
    private int drink_id;
    private String review;
    private int rating;
    private String user_name;
}
