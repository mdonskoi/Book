package JavaForChildren.MyFirstProject.Chapter4;

import java.lang.String;

/**
 * Created by а on 16.01.2015.
 */
public  class TemperatureConverter {
    public String converterTemp(int temperature, char convertTo) {
        if (convertTo == 'F') {
            temperature = temperature * 9 / 5 + 32;
        } else if (convertTo == 'C') {
            temperature = temperature * 5 / 9 - 32;
        }
        return "Temperature is: " + temperature; // temperature convert to String automatically
    }
    public static void main(String[] args){
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println(tc.converterTemp(2,'C'));

    }
}

