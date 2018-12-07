public class PizzaFactory {
    public static PizzaFactory getFactory (String name){
        switch (name) {
            case ("Hut"):
                return PizzaHutFactory.getFactory();
            case("Domino"):
                return DominoFactory.getFactory();
            default:
                return null;
        }
    }
    public abstract  Pizza createPizza(String name);
}
