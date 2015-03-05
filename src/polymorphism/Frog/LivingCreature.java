package polymorphism.Frog;

/* живое существо*/
class LivingCreature {
    private Characteristic p = new Characteristic("жвое существо");
    private Description t = new Description("обычное живое сущесво");
    LivingCreature() {
        System.out.println("LivingCreature()");
    }
    protected void dispose() {
        System.out.println("dispose в LivingCreature ");
        t.dispose();
        p.dispose();
    }
}
