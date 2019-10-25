package me.mafrans.polycalc;

import java.util.Arrays;

/**
 * Main class
 *
 * @author Mafrans
 * @since 1.0
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Polynomial p = new Polynomial(2);
        p.setConstant(0, 3);
        p.setConstant(1, 6);

        System.out.println(p.toString());
        System.out.println(Arrays.toString(p.solve()));
        System.out.println(p.f(10));
        System.out.println(p.deriv(10));
    }

    public static void log(Object... objects) {
        StringBuilder bob = new StringBuilder();
        for(Object o : objects) {
            bob.append(o);
        }
        System.out.println(bob.toString());
    }

    public static void log(String glue, Object... objects) {
        StringBuilder bob = new StringBuilder();

        boolean b = false;
        for(Object o : objects) {
            if(b) {
                bob.append(glue);
            }
            bob.append(o);
            b = true;
        }
        System.out.println(bob.toString());
    }
}
