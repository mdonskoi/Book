package com.book_175;

/**
 * Created by а on 19.10.2014.
 */
public class FinalArguments {
    void with(final Gizmo g) {
        //! g = new Gismo(); //Запрещено, т к  g объявлено final
    }
    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }
    int g(final int i) { return i + 1; }
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
