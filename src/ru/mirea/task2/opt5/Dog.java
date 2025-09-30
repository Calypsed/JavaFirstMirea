package ru.mirea.task2.opt5;

public class Dog {

//    Разработайте и реализуйте класс Dog (Собака), поля класса описывают
//    кличку и возраст собаки. Необходимо выполнить следующие действия:
//    определить конструктор собаки, чтобы принять и инициализировать данные
//    экземпляра., включить стандартные методы (аксессоры) для получения и
//    установки для имени и возраста, включить метод для перевода возраста собаки в
//    “человеческий” возраст (возраст семь раз собаки), включите метод ToString,
//    который возвращает описание экземпляра собаки в виде строки. Создание класса
//    тестера под названием ПитомникСобак, реализует массив собак и основной
//    метод этого класса позволяет добавить в него несколько объектов собаки

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "name: " + name +
                " age: " + age;
    }

    public int ageToHumanEquiv(){
        return age * 7;
    }
}
