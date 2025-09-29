package ru.mirea.task2.opt5;
import java.util.Scanner;

public class DogShelter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько собак вы сегодня подобрали с улицы? Введите число: ");
        int n = sc.nextInt();
        Dog[] doggies = new Dog[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите кличку и возраст для собаки №%d: ", i + 1);
            String name = sc.next();
            int age = sc.nextInt();
            Dog doggo = new Dog(name, age);
            doggies[i] = doggo;
        }
        System.out.println("Великолепно! Вот все ваши собаки: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d) %s\n", i + 1, doggies[i].toString());
        }
    }
}
