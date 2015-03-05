package polymorphism.Sandwich;

/**
 * Created by а on 03.01.2015.
 */
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() {
        System.out.println("Sandwich()");}
    public static void main(String[] args){
        new Sandwich();
    }
}
