package com.company;

public class newtonMethod extends abstractAlg {
    public newtonMethod(double x0, double e) {
        this.x0 = x0;
        this.e = e;

    }

    private static double functionDerivative(double x) { //x^2 + 2x - 1
        return 2 * x + 2;
    }

    @Override
    protected double calcxNext(double prevX, double x, double e) {
        while (true) {
            x = prevX - (f(prevX) / functionDerivative(prevX));
            if (Math.abs(x - prevX) < e) break;
            x = prevX - (f(prevX) / functionDerivative(prevX));
            prevX = x;

        }
        return (x);

    }

    @Override
    protected double calcX(double x2) {
        return functionDerivative(x2);
    }

    @Override
    protected double f(double x) { //x^2 + 2x - 1
        return x * (x + 2) - 1;
    }

}