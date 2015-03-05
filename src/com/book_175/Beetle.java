package com.book_175;

/**
 * Created by а on 19.10.2014.
 */
public class Beetle extends Insect {
    private int k = printInit("Поле Beetle k инициализировано");
    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 =
            printInit("Поле Beetle x2 инициализировано");
    public static void main(String[] args) {
        System.out.println("Конструктор Beetle");
        Beetle b = new Beetle();
    }
}
