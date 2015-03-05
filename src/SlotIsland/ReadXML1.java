package SlotIsland;

//source: http://www.mkyong.com/java/how-to-read-xml-file-in-java-sax-parser/

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import polymorphism.Stringed;

public class ReadXML1 {

    public static void main(String argv[]) {

        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {

                boolean bfname = false;
                boolean blname = false;
                boolean bnname = false;
                boolean bsalary = false;

                public void
                startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

                    System.out.println("Start Element :" + qName);

                    if (qName.equalsIgnoreCase("FIRSTNAME")) {
                        bfname = true;
                    }

                    if (qName.equalsIgnoreCase("LASTNAME")) {
                        blname = true;
                    }

                    if (qName.equalsIgnoreCase("NICKNAME")) {
                        bnname = true;
                    }

                    if (qName.equalsIgnoreCase("SALARY")) {
                        bsalary = true;
                    }
                }

                public void endElement(String uri, String localName, String qName) throws SAXException {

                    if (bfname) {
                        System.out.println("First name :" + new String());
                        bfname = false;
                    }

                    if (blname) {
                        System.out.println("Last name :" + new String());
                        blname = false;
                    }

                    if (bnname) {
                        System.out.println("Nick name :" + new String());
                        bnname = false;
                    }

                    if (bsalary) {
                        System.out.println("Salary :" + new String());
                        bsalary = false;
                    }
                }

            };

            saxParser.parse("C:\\1.xml", handler);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
