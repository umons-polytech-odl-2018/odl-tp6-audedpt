public class MargheritaDom extends Pizza {
    public MargheritaDom(){
        super('Margherita');
        this.addAliment(new dough());
        this.addAliment(new tomatoSauce());
        this.addAliment(new cheese());
    };

}
