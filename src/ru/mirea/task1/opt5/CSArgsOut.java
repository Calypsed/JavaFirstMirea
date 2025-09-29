package ru.mirea.task1.opt5;
import java.util.Scanner;

public class CSArgsOut {
    /*
    Написать программу, в результате которой выводятся на экран
    аргументы командной строки в цикле for.
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
