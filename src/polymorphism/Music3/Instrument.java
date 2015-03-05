package polymorphism.Music3;

import polymorphism.Note;

public class Instrument {
    void play(Note n){
        System.out.println("Instrument play()" + n);}
    String what(){return "Instrument";}
    void adjust() {
        System.out.println(" Adjust instrument");}
}
