package polymorphism;


public class Wind extends Instrument {
    // method interface overriding
    public void play(Note n){
        System.out.println("Wind play()" + n);
    }
}
