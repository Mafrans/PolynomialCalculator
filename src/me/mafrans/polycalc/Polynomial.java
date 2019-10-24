package me.mafrans.polycalc;

import java.util.Arrays;

/**
 * This defines a polynomial function, currently supporting up to the second grade.
 * Used by first defining a new instance, then manually setting constants.
 *
 * @author Mafrans
 * @since 1.0
 * @version 1.0
 */
public class Polynomial {
    /**
     * The function's grade, indicates which polynomial solution to use.
     */
    private int grade;

    /**
     * An array of constants used in the function,
     * where all constants but the last one represents a coefficient.
     */
    private double[] constants;

    /**
     * New Polynomial instance
     * @param grade The grade of the polynomial function.
     */
    public Polynomial(int grade) {
        this.grade = grade;
        this.constants = new double[grade+1];

        // Fill the array with the default coefficient (1)
        // This is because the default array value (0) is not fit for a polynomial.
        Arrays.fill(this.constants, 1);

        // The last constant, however, is not a coefficient,
        // so it's default value should be 0.
        this.constants[grade] = 0;
    }

    /**
     * Set the value of a function constant.
     * @param index The constant's index, starts at 0.
     * @param value The constant's value.
     */
    public void setConstant(int index, double value) {
        constants[index] = value;
    }

    /**
     * @return A string representation of the current function, defined as "ax^n + bx^(n-1) + cx^(n-2)...".
     */
    @Override
    public String toString() {
        StringBuilder bob = new StringBuilder();
        for(int i = 0; i < grade; i++) {
            bob.append(constants[i] != 1 ? constants[i] : "")
                    .append(i != (grade - i) ? "x^" + (grade - i) : "x");

            if(i + 1 < grade) {
                bob.append(" + ");
            }
        }
        return bob.toString() + " = 0";
    }

    /**
     * Solves the current function.
     * @return All root values of the current function, in the form of an array.
     */
    public double[] solve() {
        switch (grade) {
            case 0:
                return new double[] {constants[0]};
            case 1:
                return new double[] {Solver.firstGrade(constants[0], constants[1])};
            case 2:
                return Solver.secondGrade(constants[0], constants[1], constants[2]);
            case 3:
                return Solver.thirdGrade(constants[0], constants[1], constants[2], constants[3]);
        }
        return null;
    }
}
