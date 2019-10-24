package me.mafrans.polycalc;

public class Polynomial {
    private int grade;
    private double[] constants;

    public Polynomial(int grade) {
        this.grade = grade;
        this.constants = new double[grade+1];
    }

    public void setConstant(int index, double value) {
        constants[index] = value;
    }

    @Override
    public String toString() {
        for(int i = 0; i < grade; i++) {
            
        }
        return String.format("");
    }
}
