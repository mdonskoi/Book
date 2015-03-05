package com.book_175;

/**
 * Created by а on 19.10.2014.
 */
public class Villain {
    private String name;
    protected void set(String nm) { name = nm; }
    public Villain(String name) { this.name = name; }
    @Override
    public String toString() {
        return "Я объект Villain и моё имя " + name;
    }
}
