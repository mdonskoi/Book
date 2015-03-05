package differentSelfMadeExcercises;

/**
 * Created by а on 19.10.2014.
 */
public class SquaresOfEvens {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if ((i % 2) != 0) continue;
            int a = i * i;
            System.out.println("Square of even " + i + " = " + a);
        }
    }
}
