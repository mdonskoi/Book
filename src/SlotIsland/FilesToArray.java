/* package SlotIsland;

//source: http://forum.codeby.net/topic10167.html

import java.io.*;

public class FilesToArray {
  // File baseFile = new File(args[0]);

    //create lines array
    String[] lines = new String[0];
    String[] buf;

    String s = "";
    int count = 0;

    //read file
   // try {
        FileReader fr = new FileReader(baseFile);
        BufferedReader br = new BufferedReader(fr);

     //   while ((s = br.readLine()) != null) {
          //skopiruem tekuschi massiv
         //   buf = lines;
            //sozdadim novy na 1 stroku bolshe
         //   lines = new String[count + 1];
            //perenesem bufer v novy massiv i dobavim v nego prochitannuu stroku
         //   for (int i = 0; i < buf.length; i++) {
                lines[i] = buf[i];
            }
            lines[count] = s;
            count++;
        }

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
        br.close();

    } catch (IOException e) {
    }

    }
*/
