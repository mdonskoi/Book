package com.book_175;

/**
 * Created by а on 19.10.2014.
 */
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); //Восходящее преобразование
    }
}
