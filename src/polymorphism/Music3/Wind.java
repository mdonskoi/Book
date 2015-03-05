package polymorphism.Music3;

import polymorphism.Note;

/**
 * Created by а on 02.01.2015.
 */
 class Wind extends Instrument {
    void play(Note n){
        System.out.println("Wind play() " + n);}
        String what() {return "Wind";}
        void adjust(){
            System.out.println("Adjusting wind");}
}
