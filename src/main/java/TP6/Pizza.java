package TP6;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Food {
    private String name;
    private List<Aliment> ingredients;
    
    public Pizza(String name){
        this.name = name;
        ingredients = new ArrayList<>();
    }
    
    public void addIngredients(Aliment newIngredient){
        ingredients.add(newIngredient);
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public float getPrice(){
        float price = 0;
        for (Aliment ingredient: ingredients) {
            price+=ingredient.getPrice();
        }
        return price;
    }

    @Override
    public String toString(){
        String result = "";
        result += name + "\nComposition :\n";
        for (Aliment ingredient: ingredients) {
            result += ingredient + "\n";
        }
        result += "Price :" + getPrice();
        return result;
    }
    
}
