package dev.sid.devbar_backend.service;

import dev.sid.devbar_backend.entity.Drink;
import dev.sid.devbar_backend.repository.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {

    private DrinkRepository drinkRepository;

    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    /*GET METHODS*/
    // get all
    public List<Drink> getAllDrinks(){
        return drinkRepository.findAll();
    }
    // get specific drink based on id
    public Drink getDrinkById(int id){
        return drinkRepository.findById(id).orElse(null);
    }
    //get specific drink based on name
    public Drink getDrinkByName(String name){
        return drinkRepository.findByName(name);
    }


    /*Post Methods*/
    //add 1 product
    public Drink saveDrink(Drink drink){
        return drinkRepository.save(drink);
    }

    //add multiple products
    public List<Drink> saveAllDrink(List<Drink> drink){
        return drinkRepository.saveAll(drink);
    }

}
