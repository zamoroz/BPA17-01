package com.company;
import java.io.*;
import java.util.*;

public class Solution_pow {
    /*
    Определить максимальную мощность подмножества элементов заданного массива. Элементы включаются в подмножество, если
    разность между любыми элементами подмножества меньше либо равна 1.
    Дано: n - количество чисел в массиве
    a - массив чисел
    2 <= n <= 100
    0 < a[i] < 100
    ответ должен быть >=2, задаются такие данные
    Пример:
        9
        1 1 2 2 4 4 5 5 5
    Ответ:
        5
    Пример:
        6
        4 6 5 3 3 1
        Ответ:
        3
     Разбить массив на n-количество отрезков так, чтобы разница в отсортированном массиве между 1 и -1 элементом была =< 1
        */

    static int func1(int[] a) {
        int[] arrayOfLength = new int [a.length];
        int len = 0;
        Arrays.sort(a);
        for (int i = 0 ; i <a.length; i++) {
            len = 0;
            for (int j = i ; j<a.length ; j++){
                if (Math.abs(a[j]-a[i]) <=1) {
                    len++;
                }
            }
            arrayOfLength[i] = len;
        }


        int max = arrayOfLength[0];
        for (int c = 0; c<arrayOfLength.length;c++) max = Math.max(max,arrayOfLength[c]);
        return (max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));//System.getenv("OUTPUT_PATH")

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = func1(a);

        System.out.println(result);
        scanner.close();
    }
}