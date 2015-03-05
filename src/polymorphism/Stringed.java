package polymorphism;

/**
 * Created by а on 02.01.2015.
 */
public class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
}
