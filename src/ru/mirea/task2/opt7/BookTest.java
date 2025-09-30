package ru.mirea.task2.opt7;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookShelf myShelf = new BookShelf(5);
        myShelf.addBook(0, "Brandon Sanderson", "The Way of Kings", 2010);
        myShelf.addBook(1, "Brandon Sanderson", "Oathbringer", 2017);
        myShelf.addBook(2, "Brandon Sanderson", "Wind and Truth", 2024);
        myShelf.addBook(3, "Brandon Sanderson", "Rythm of War", 2020);
        myShelf.addBook(4, "Brandon Sanderson", "Words of Radiance", 2014);
        do{
            System.out.print("Ваша полка: \n");
            System.out.print(myShelf.toString());
            System.out.print("Выберите метод: \n0) Посмотреть самую раннюю книгу \n1) Посмотреть самую позднюю книгу \n2) Отсортировать книги по возрастанию года выпуска \n  -->");
            int option = sc.nextInt();
            switch (option){
                case 0:
                    System.out.println(myShelf.getEarliestBook().toString());
                    break;
                case 1:
                    System.out.println(myShelf.getLatestBook().toString());
                    break;
                case 2:
                    myShelf.sortBooksByYear();
                    System.out.print("Ваша полка: \n");
                    System.out.print(myShelf.toString());
                    break;
                default:
                    System.out.println("୧(๑•̀ᗝ•́)૭ \n");
                    break;
            }
            System.out.print("Введите 0 чтобы выйти: \n -->");

            if(sc.next().equals("0")){
                break;
            }
        }while(true);

    }
}
