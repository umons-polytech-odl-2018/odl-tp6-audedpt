package TP6.pizza;


import TP6.Pizza;
import TP6.aliment.Fromage;
import TP6.aliment.Olives;
import TP6.aliment.Pate;
import TP6.aliment.SauceTomate;

public class MargheritaHut extends Pizza {
    public MargheritaHut(){
        super("Margherita Pizza Hut");
        addIngredients(new Pate());
        addIngredients(new Fromage());
        addIngredients(new SauceTomate());
        addIngredients(new Olives());
    }
}
