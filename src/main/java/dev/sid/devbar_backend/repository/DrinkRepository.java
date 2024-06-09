package dev.sid.devbar_backend.repository;
import dev.sid.devbar_backend.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Integer> {
    Drink findByName(String name);
}
