package ru.mirea.task2.opt6;

public class Circle {
//    Создать класс, описывающий модель окружности (Circle). В классе
//    должны быть описаны нужные свойства окружности и методы для получения и
//    изменения этих свойств. Добавить методы для расчета площади круга и длины
//    окружности, а также метод позволяющий сравнивать две окружности. При
//    помощи класса CircleTest, содержащего статический метод main(String[] args),
//    протестировать работу класcа Circle.
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double calcArea(){
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString(){
        return "x: " + x +
                " y: " + y +
                " r: " + r;
    }

    public double calcCircumference(){
        return 2 * Math.PI * r;
    }

    public static boolean isC1X_moreThen_C2X(Circle c1, Circle c2){
        return c1.x >= c2.x;
    }

    public static boolean isC1Y_moreThen_C2Y(Circle c1, Circle c2){
        return c1.y >= c2.y;
    }

    public static boolean isC1LargerThenC2(Circle c1, Circle c2){
        return c1.r >= c2.r;
    }
}
