package JavaRush;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Level3Lesson8Task1 {


    public static void main(String[] args) throws Exception {
        // Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();
        // int age = scanner.nextInt();
        // System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");


        InputStream inputstream = System.in;
        Reader inputstreamReader = new InputStreamReader(inputstream);
        BufferedReader bufferedReader = new BufferedReader(inputstreamReader);

        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");


    }

}
