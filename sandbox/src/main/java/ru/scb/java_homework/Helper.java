package ru.scb.java_homework;

public class Helper {

    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        Point p2 = new Point(3,6);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
    }

}