package TP6.factory;

import TP6.Pizza;
import TP6.pizza.MargheritaHut;

public class HutFactory implements PizzaFactory {
    private static HutFactory theFactory;

    public static HutFactory getFactory(){
        if(theFactory==null)
            theFactory = new HutFactory();
        return theFactory;
    }
    @Override
    public Pizza createPizza(String type){
        switch (type.toLowerCase())
        {
            case "margherita": return new MargheritaHut();
            default: System.out.println("Default");
                return null;
        }
    }
}
