package polymorphism.Music3;

import polymorphism.Note;

/**
 * Created by а on 02.01.2015.
 */
public class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play()" + n);}
        String what() {return "Woodwind";}
}
