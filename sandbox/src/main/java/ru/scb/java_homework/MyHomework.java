package ru.scb.java_homework;

public class MyHomework {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Roman");

        Point p = new Point(11, 2, 0, 0);
        System.out.println("Расстояние между двумя точками = " + p.distance());

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}