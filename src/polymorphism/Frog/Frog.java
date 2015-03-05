package polymorphism.Frog;

//лягушка
public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("квакает");
    private Description t = new Description("ест жуков");
    public Frog() {
        System.out.println("Frog()");}
    protected void dispose() {
        System.out.println("завершение Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("пока");
        frog.dispose();
    }
}
