package ru.mirea.task2.opt6;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координаты Х, У и радиус R для окружности №1: ");
        Circle c1 = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("Введите координаты Х, У и радиус R для окружности №2: ");
        Circle c2 = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
        boolean isContinue;
        String nextMsg;
        do
        {
            System.out.printf("Что вы хотите сравнить? Введите номер: \n#1 Х-координата центра \n#2 Y-координата центра \n#3 Радиус\n --> ");
            int choice = sc.nextInt();
            String res;
            switch (choice) {
                case 1:
                    res = Circle.isC1X_moreThen_C2X(c1, c2) ? "ПРАВЕЕ" : "ЛЕВЕЕ";
                    System.out.printf("Центр первой окружности %s центра второй окружности. \n", res);
                    break;
                case 2:
                    res = Circle.isC1X_moreThen_C2X(c1, c2) ? "ВЫШЕ" : "НИЖЕ";
                    System.out.printf("Центр первой окружности %s центра второй окружности. \n", res);
                    break;
                case 3:
                    res = Circle.isC1LargerThenC2(c1, c2) ? "БОЛЬШЕ" : "МЕНЬШЕ";
                    System.out.printf("Первая окружность %s второй. \n", res);
                    break;
                default:
                    System.out.print("୧(๑•̀ᗝ•́)૭ \n");
                    break;
            }

            System.out.printf("Хотите ещё что-то сравнить? y / n \n --> ");
        }
        while (sc.next().equals("y"));
    }
}
