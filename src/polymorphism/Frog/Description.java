package polymorphism.Frog;

/**
 * Created by а on 03.01.2015.
 */
public class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Создаём Description " + s);
    }
    protected void dispose() {
        System.out.println("Завершаем Description " + s);
    }
}
