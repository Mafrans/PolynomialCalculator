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
        Polynomial polynomial = new Polynomial(2);

        System.out.println(polynomial.toString());
        System.out.println(Arrays.toString(polynomial.solve()));
    }
}
