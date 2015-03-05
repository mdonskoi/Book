package reusing;

/**
 * Created by а on 18.10.2014.
 */
class Circle extends Shape {
    Circle(int i ) {
        super(i);
        System.out.println("Рисуем окружность Circle");
    }
    void dispose() {
        System.out.println("Стираем окружность Circle");
    }
}
