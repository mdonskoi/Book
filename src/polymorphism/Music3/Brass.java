package polymorphism.Music3;

import polymorphism.Note;

/**
 * Created by а on 02.01.2015.
 */
public class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);}
        void adjust() {
            System.out.println("Adjusting Brass");}
}
