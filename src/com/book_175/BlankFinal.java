package com.book_175;

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;
    //Пустые константы необходимо инициализировать в конструкторе:
    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }
    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }
    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }

}
