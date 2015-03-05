package JavaRush;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.*;
public class MamaWashedTheFrame {
    public static void main(String[] args) {
        int i;
        // String s1 = "Мама";
        // String s2 = "Мыла";
        // String s3 = "Раму";
        String[] a = {"Мама", "Мыла", "Раму"};


        for (i = 0; i < Array.getLength(a); i++)


            System.out.println(a[i]);
       // swap(s1, s2, s3);
    }
}
