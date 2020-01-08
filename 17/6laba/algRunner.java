package com.company;


public class algRunner {
    public static void main(String[] args) {
        double x0 = -10;
        double x1 = 10;
        double e = 0.0001;
        abstractAlg methodKhord = new methodKhord(x0, x1, e);
        abstractAlg newtonMethod = new newtonMethod(x0, e);

        double resultOfKhord = methodKhord.getAnswer(x0, x1);
        double resultOfNewton = newtonMethod.getAnswer(x0, x1);
        if (Double.isNaN(resultOfKhord) || (Double.isInfinite(resultOfKhord))) {
            System.out.println("Метод хорд не сходится");
        } else {
            System.out.println("Метод хорд: " + resultOfKhord);
        }
        if (Double.isNaN((resultOfNewton)) || (Double.isInfinite(resultOfNewton))) {
            System.out.println("Метод Ньютона не сходится");
        } else {
            System.out.println("Метод Ньютона: " + resultOfNewton);

        }

    }


}
