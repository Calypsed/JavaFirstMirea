package ru.mirea.task1.opt7;
import java.util.Scanner;

public class fatorialMaker {
    /*
    Написать программу, которая с помощью метода класса, вычисляет
    факториал числа (использовать управляющую конструкцию цикла), проверить
    работу метода
     */

    public static int facOfN(int n){
        if (n != 1){
            return facOfN(n - 1) * n;
        } else {
            return 1;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для поиска факториала: ");
        int n = sc.nextInt();
        int res = 1;

        for (int i = n; i > 0; i--) {
            res *= i;
        }

        System.out.println(res);

        //Выполним проверку

        System.out.print(facOfN(n));
    }
}
