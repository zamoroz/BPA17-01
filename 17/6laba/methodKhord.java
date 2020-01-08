package com.company;

public class methodKhord extends abstractAlg {
    public methodKhord(double x0, double x1, double e) {
        this.x0 = x0;
        this.x1 = x1;
        this.e = e;

    }

    @Override
    public double calcxNext(double x_prev, double x_curr, double e) {
        double x_next = 0;
        double tmp;
        do {
            tmp = x_next;
            x_next = x_curr - f(x_curr) * (x_prev - x_curr) / (f(x_prev) - f(x_curr));
            x_prev = x_curr;
            x_curr = tmp;
        } while (Math.abs(x_next - x_curr) > e);
        return x_next;
    }

    @Override
    protected double calcX(double x1) {
        return this.x1;
    }

    @Override
    protected double f(double x) {
        return x * (x + 2) - 1;
    }
}












    /*public static void main(String[] args) {
        double x0 = 2;
        double x1 = 10;
        double e = 0.001;
        double x = method_chord(x0, x1, e);
        System.out.println(x);
    }
     */

    /*public static double method_chord(double x_prev, double x_curr, double e) {
        double x_next = 0;
        double tmp;
        do {
            tmp = x_next;
            x_next = x_curr - f(x_curr) * (x_prev - x_curr) / (f(x_prev) - f(x_curr));
            x_prev = x_curr;
            x_curr = tmp;
        } while (Math.abs(x_next - x_curr) > e);
        return x_next;
    }
     */


