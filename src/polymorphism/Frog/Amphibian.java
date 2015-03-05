package polymorphism.Frog;

//земноводное
public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("может жить в воде");
    private Description t = new Description("и в воде и на земле");
    Amphibian() {
        System.out.println("Amphibian()");
    }
    protected void dispose() {
        System.out.println("dispose в Amphibian ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
