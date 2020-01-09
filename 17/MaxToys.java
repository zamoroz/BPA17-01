package com.company;

import java.util.Arrays;

public class MaxToys {
    private int balance;
    private int c;
    private int[] intItems;
    private String ss;

    //konstruktor
    public MaxToys(int k) {
        balance = k;

    }

    //setter
    public int getC() {
        return this.c;
    }

    //getter
    public void setSs(String ss) {
        this.ss = ss;
    }

    // privatniy metod iz stroki v massiv
    private int[] Scan(String ss) {
        int[] numArr = Arrays.stream(ss.split(" ")).mapToInt(Integer::parseInt).toArray();
        return (numArr);
    }


    public int Main(String items) {
        int sum = 0, N = 0;
        intItems = Scan(items);
        N = intItems.length;
        Arrays.sort(intItems);

        for (int i = 0; i < N; i++) {

            if (sum + intItems[i] <= balance) {
                sum = sum + intItems[i];
                c++;

            }

        }
        return c;


    }
}