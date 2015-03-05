package polymorphism;
// наследование и восходящее преобразование

import com.book_175.*;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_С);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // восходящее преобразование
    }
}