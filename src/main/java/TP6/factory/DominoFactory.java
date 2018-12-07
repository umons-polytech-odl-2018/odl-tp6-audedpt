package TP6.factory;

import TP6.Pizza;
import TP6.pizza.MargheritaDomino;

public class DominoFactory implements PizzaFactory {
    private int stocks[];
    private static DominoFactory theFactory;

    private DominoFactory(){
        stocks = new int[1];
        for (int i:stocks) {
            stocks[i] = 2;
        }
    }

    public static DominoFactory getFactory(){
        if(theFactory==null)
            theFactory = new DominoFactory();
        return theFactory;
    }

    @Override
    public Pizza createPizza(String type){
     switch (type.toLowerCase())
     {
         case ("margherita"): if(stocks[0]>=1) {
               return new MargheritaDomino();
                 stocks[0]--;
            }
            else{
                 System.out.println("Out of stocks");
                 return null;
            }
         default: System.out.println("Default");
             return null;
     }
    }
}
