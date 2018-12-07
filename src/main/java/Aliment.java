public class Aliment implements Food {
    private String name;
    private float price;

    public Aliment(String name, float price) {
        this.name = name;
        this. price = price;
    }

    @Override
    public String getName(){return name;}

    @Override
    public float getPrice(){return price;}

    public void setName (String name){ this.name = name;}

    public void setPrice(float price){ this.price = price;}

    @Override
    public String toString () {
        return "Food{"+"name= " +name + '\''+", price"+price+'}';
    }
}
