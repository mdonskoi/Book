package polymorphism;

/**
 * Created by а on 02.01.2015.
 */
public class Music2 {
    public static void tune(Wind i){
        i.play(Note.MIDDLE_С);
    }
    public static void tune(Brass i) {
        i.play(Note.MIDDLE_С);
    }
    public static void main(String args[]) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // без восходящего преобразования
        //tune(violin);
        tune(frenchHorn);
    }
}
