package polymorphism.ReferenceCounting;

/**
 * Created by а on 03.01.2015.
 */
 class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("создаём " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }
    public String toString(){return "Composing " + id;}

}
