import TP6.Aliment;
import TP6.Pizza;
import TP6.factory.DominoFactory;
import TP6.factory.HutFactory;
import TP6.factory.PizzaFactory;
import TP6.pizza.MargheritaDomino;
import TP6.pizza.MargheritaHut;

public class App {
    public static void main(String args[]){
        PizzaFactory factory = new HutFactory();

        MargheritaHut margherita = (MargheritaHut) factory.createPizza("margherita");

        System.out.println(margherita);
    }
}

