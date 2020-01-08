package com.company;

public abstract class abstractAlg {
    double x0;
    double x1;
    double e;
    double xnext;


    protected abstractAlg() {
    }

    public double getAnswer(double x0, double e) {
        x0 = this.x0;
        x1 = calcX(x0);
        e = this.e;
        xnext = calcxNext(x0, x1, e);
        return (xnext);


    }

    protected abstract double calcxNext(double x0, double x1, double e);

    protected abstract double calcX(double x);

    protected abstract double f(double x);
}

