package ru.top.practic.oop.practice7;

public class Main {

    //Задание 4
    //Создайте абстрактный базовый класс Фигура с абстрактным методом для подсчета площади. Создайте
    //производные классы: прямоугольник, круг, прямоугольный
    //треугольник, трапеция со своими реализациями метода
    //для подсчета площади. Для проверки определите массив
    //ссылок на абстрактный класс, которым присваиваются
    //адреса различных объектов классов-потомков.
    public static void main(String[] args) {
        Circle circle = new Circle(4d);
        Rectangle rectangle = new Rectangle(5d, 10d);
        Triangle triangle = new Triangle(4d, 3d);

        Figure[] array = new Figure[3];
        array[0] = circle;
        array[1] = rectangle;
        array[2] = triangle;

        for (Figure current : array) {
            System.out.println(current.getSquare());
        }
    }
}
