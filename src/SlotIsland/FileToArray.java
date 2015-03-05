package SlotIsland;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class FileToArray {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list1 = new ArrayList<String>();
        Scanner scanner1 = new Scanner(new File("C:\\1.txt"));

        ArrayList<String> list2 = new ArrayList<String>();
        Scanner scanner2 = new Scanner(new File("C:\\2.txt"));

    scanner1.hasNext();
    list1.add(scanner1.nextLine());
    scanner1.close();

    scanner2.hasNext();
    list2.add(scanner2.nextLine());
    scanner2.close();


        //for (int i = 0; i < list1.size(); i++)
          // list1.equals(list2);
        //System.out.println(list2);




       // else Integer a = list2.size();

        // Need comparator to compute which of two lists are smaller

        //if (list1.size() < list2.size())
        //    int f = (int)list1.size();
        //            else

        ListIterator<String> l1 = list1.listIterator();
        ListIterator<String> l2 = list2.listIterator();
       //for (int i = 0; i < list1.size(); i++)
        //while (l1.hasNext())
           // l2.hasNext();
           Boolean b = l1.equals(l2);
        if (b == false)
           System.out.println(scanner1);
           System.out.println(scanner1);


               // System.out.println(i);

      //  System.out.println(list1);
      //  System.out.println(list2);


    }
}