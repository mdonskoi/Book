package polymorphism.ReferenceCounting;


//уничтожение совместно используемых встроенных объектов
 class Shared {
    private int recount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("созаем " + this);
    }
    public void addRef() {recount++;}
    protected void dispose(){
        if (--recount == 0)
            System.out.println("Disposing " + this);
    }
    public String toString(){return "Shared " + id;}

}
