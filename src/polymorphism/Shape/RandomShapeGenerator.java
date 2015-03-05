package polymorphism.Shape;
import java.util.*;

/**
 * Created by а on 02.01.2015.
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 3: return new Triangle();
        }
    }
}
