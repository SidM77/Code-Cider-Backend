package dev.sid.devbar_backend.controller;

import dev.sid.devbar_backend.entity.Drink;
import dev.sid.devbar_backend.service.DrinkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class DrinkController {
    private DrinkService drinkService;

    public DrinkController(DrinkService drinkService){
        this.drinkService = drinkService;
    }

    @GetMapping("/drinks")
    public List<Drink> findAllDrinks(){
        return drinkService.getAllDrinks();
    }

    @GetMapping("/drinkById{id}")
    public Drink findDrinkById(@PathVariable int id){
        return drinkService.getDrinkById(id);
    }
    @GetMapping("/drinkByName/{name}")
    public Drink getDrinkByName(@PathVariable String name){
        return drinkService.getDrinkByName(name);
    }

    @PostMapping("/addDrink")
    public Drink addDrink(@RequestBody Drink drink){
        return drinkService.saveDrink(drink);
    }

    @PostMapping("/addDrinks")
    public List<Drink> addDrinks(@RequestBody List<Drink> drinks){
        return drinkService.saveAllDrink(drinks);
    }


}
