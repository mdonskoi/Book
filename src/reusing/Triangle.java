package reusing;

/**
 * Created by а on 18.10.2014.
 */
public class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Рисуем треугольник Triangle");
    }
    void dispose() {
        super.dispose();
    }
}
