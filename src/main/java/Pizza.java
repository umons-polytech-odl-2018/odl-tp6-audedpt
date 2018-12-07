import Aliment;

import java.util.ArrayList;

public abstract class Pizza implements Food {
    String name;
    ArrayList<Aliment> aliments;

    public Pizza(String name) {
        this.name = name;
        aliments = new ArrayList<>();
    }

    public void addAliment(Aliment aliment){
        this.aliments.add(aliment);
    }

    @Override //permet de remplacer un élément déjà défini par un certain nom
    public float getPrice(){
        float price = 0;

        for (Aliment aliment: aliments ){
            price += aliment.getPrice();
        }
        return price;
    }

    public String getName() { return name;}

    @Override
    public String toString () {
        return "PizzaName" + name + "Aliments{" + aliments +"} Price=" + getPrice();
    }
}
