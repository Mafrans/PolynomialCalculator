package me.mafrans.polycalc;

/**
 * Utility class solving a variety of mathematical functions.
 *
 * @author Mafrans
 * @since 1.0
 * @version 1.0
 */
public class Solver {
    /**
     * Solves the function <code>ax + b = 0</code>.
     * @param a The constant <code>a</code>.
     * @param b The constant <code>b</code>.
     * @return The function's root.
     */
    public static double firstGrade(double a, double b) {
        return -b/a;
    }

    /**
     * Solves the function <code>ax^2 + bx + c = 0</code>.
     * @param a The constant <code>a</code>.
     * @param b The constant <code>b</code>.
     * @param c The constant <code>c</code>.
     * @return The function's two roots, can be NaN.
     */
    public static double[] secondGrade(double a, double b, double c) {
        double[] answers = new double[2];
        double _b = b/a;
        double _c = c/a;

        System.out.println(String.format("a: %f, b: %f, c: %f", a, b, _c));

        answers[0] = -(_b/2) + Math.sqrt(Math.pow(_b/2, 2) - _c);
        answers[1] = -(_b/2) - Math.sqrt(Math.pow(_b/2, 2) - _c);
        return answers;
    }

    /**
     * Solves the function <code>ax^3 + bx^2 + cx + d = 0</code>.
     * @param a The constant <code>a</code>.
     * @param b The constant <code>b</code>.
     * @param c The constant <code>c</code>.
     * @param d The constant <code>d</code>.
     * @return The function's three roots, can be NaN.
     */
    public static double[] thirdGrade(double a, double b, double c, double d) {
        double[] answers = new double[3];
        double _b = b/a;
        double _c = c/a;
        double _d = d/a;


        return answers;
    }
}
