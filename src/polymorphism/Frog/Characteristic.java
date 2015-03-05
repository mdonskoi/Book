package polymorphism.Frog;

/**
 * Created by а on 03.01.2015.
 */
public class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Создаём Characteristic " + s);
    }
    protected void dispose() {
        System.out.println("Завершаем Characteristic " + s);
    }
}
