package polymorphism.Music3;

import polymorphism.Note;

/**
 * Created by а on 02.01.2015.
 */
public class Music3 {
    //Работа метода не зависит отфактического типа объекта,
    //поэтому типы, добавленные в систему, будут работать правильно
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_С);
    }
    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        //Восходящее преобразование при добавлении в массив
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
