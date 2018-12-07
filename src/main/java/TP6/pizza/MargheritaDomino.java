package TP6.pizza;


import TP6.Pizza;
import TP6.aliment.Fromage;
import TP6.aliment.Pate;
import TP6.aliment.SauceTomate;

public class MargheritaDomino extends Pizza {
    public MargheritaDomino(){
        super("Margherita Domino Pizza");
        addIngredients(new Pate());
        addIngredients(new Fromage());
        addIngredients(new SauceTomate());
    }
}
