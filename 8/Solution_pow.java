package com.company;
import java.io.*;
import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static java.util.logging.Level.INFO;

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

    private static final Scanner scanner = new Scanner(System.in);
    private static Logger log = Logger.getLogger("com.company.Solution_toy");

    public static void main(String[] args) throws IOException {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(INFO);
        consoleHandler.setFormatter(new SimpleFormatter());

        try {

            log.log(INFO, "Инициализация n");
            int n = scanner.nextInt();
            log.log(INFO, "выполнение сканером функции skip ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            log.log(INFO, "инициализация массива a");
            int[] a = new int[n];
            log.log(INFO, "сканер split");
            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            log.log(INFO, "заполнение массива a ");
            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }
            log.log(INFO, "переопределяем runnable");
            Runnable runnable = () -> {
                log.log(INFO, "создаем экземпляр класса Solver");
                Solver Example = new Solver();
                log.log(INFO, "передаем в сеттер массив а");
                Example.setInputData(a);
                log.log(INFO, "вызываем метод,выполняющий вычисления и выводящий результат");
                Example.SolveProblem();
            };
            log.log(INFO, "закрываем сканнер");
            scanner.close();
            log.log(INFO, "инициализируем поток");
            Thread thread = new Thread(runnable);
            log.log(INFO, "запускаем второй поток");
            thread.start();
        } catch (Exception error) {

            log.log(INFO, "Вызвано исключение " +error.getMessage());
        }
    }
 }
