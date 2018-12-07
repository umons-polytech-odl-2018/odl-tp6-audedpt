package TP6.factory;

import TP6.Pizza;

public interface PizzaFactory {
   public static PizzaFactory getFactory(String name){
        switch (name){
            case("Hut"):
                return HutFactory.getFactory();
            case("Domino"):
                return DominoFactory.getFactory();
                default: return null;
        }
    }

    public Pizza createPizza(String type);
}
