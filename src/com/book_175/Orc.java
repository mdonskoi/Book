package com.book_175;

/**
 * Created by а on 19.10.2014.
 */
public class Orc extends Villain {
    private int orcNumber;
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name); //Доступно, так как объявлено protected
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args) {
        Orc orc = new Orc("Лимбургер",12);
        System.out.println(orc);
        orc.change("Боб", 19);
        System.out.println(orc);
    }
}
