package SlotIsland;

//source: http://www.cyberforum.ru/java-j2se/thread538346.html

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfIntInTXTFile {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(new File("C:\\4.txt"));
        while (scanner.hasNext())
            list.add(scanner.nextInt());
        scanner.close();
        System.out.println("Enter number: ");
        Integer num = new Scanner(System.in).nextInt();
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) == num)
                System.out.println(i);
    }

}
