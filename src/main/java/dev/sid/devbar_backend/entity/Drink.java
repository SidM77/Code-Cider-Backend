package dev.sid.devbar_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DRINK_TABLE")
public class Drink {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String image_url;
    private int price;
    private String info;
}
