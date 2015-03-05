package polymorphism.ReferenceCounting;

/**
 * Created by а on 03.01.2015.
 */
public class ReferenceCounting {
    public static void main(String[] args){
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared),new Composing(shared),
                new Composing(shared),new Composing(shared), new Composing(shared)};
        for (Composing c : composing)
            c.dispose();
    }
}
