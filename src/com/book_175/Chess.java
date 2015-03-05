package com.book_175;

/**
 * Created by а on 18.10.2014.
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Конструктор Chess");
    }
    public static void main (String[] args) {
        Chess x = new Chess();
    }

}