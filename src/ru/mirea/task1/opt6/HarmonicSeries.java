package ru.mirea.task1.opt6;

public class HarmonicSeries {
/*
Написать программу, в результате работы которой выводятся на экран
первые 10 чисел гармонического ряда (форматировать вывод).
 */
    public static void main(String[] args) {
        int n = 10 + 1;
        double d;
        for (int i = 1; i < n; i++) {
            d = 1f / i;
            System.out.printf("%d) %5.3f%n", i, d);
        }
    }
}
