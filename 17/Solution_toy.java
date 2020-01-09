package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static java.util.logging.Level.INFO;

public class Solution_toy {

    /*
     * Лука и Фекла очень счастливы после рождения первого ребенка.
     * Их сын любит игрушки, поэтому Лука хочет прикупить чего-то.
     * Перед ним лежит ряд различных игрушек с ценами. У Луки есть только
     * определенная сумма, и он хочет максимизировать количество игрушек,
     * которые он покупает на эти деньги. Учитывая список цен и сумму,
     * которую можно потратить, какое максимальное количество игрушек можно купить?
     *
     * k - бюджет
     * 1 <= k <= 10e9
     * 1 <= n <= 10e5, n - количество цен игрушек
     * 1 <= prices[i] <= 10e9
     *
     * Пример: 7 50
     *         1 12 5 111 200 1000 10
     * Ответ: 4
     */

    private static final Scanner scanner = new Scanner(System.in);
    private static Logger LOGGER = Logger.getLogger("com.company.Solution_toy");

    public static void main(String[] args) throws IOException {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(INFO);
        consoleHandler.setFormatter(new SimpleFormatter());


        try {

            LOGGER.log(INFO, "инициализая k");
            int k = scanner.nextInt();
            LOGGER.log(INFO, "сканер скип");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            LOGGER.log(INFO, "инициализация priceItems");
            String pricesItems = scanner.nextLine();
            LOGGER.log(INFO, "создание экземпляра класса MaxToys");
            MaxToys res = new MaxToys(k);
            LOGGER.log(INFO, "переопределение runnable");
            Runnable task = () -> {
                res.Main(pricesItems);
                int result = res.getC();
                System.out.println(result);
                scanner.close();
            };
            LOGGER.log(INFO, " инициализация потока");
            Thread thread = new Thread(task);
            LOGGER.log(INFO, " запуск потока");
            thread.start();
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "что-то пошло не так", e);
        }

    }
}