package ru.scb.java_homework;

public class Point {
    public double xb;
    public double xa;
    public double yb;
    public double ya;

    public Point(double xb, double xa, double yb, double ya) {
        this.xb = xb;
        this.xa = xa;
        this.yb = yb;
        this.ya = ya;
    }
    public double distance() {
        return Math.sqrt((this.xb - this.xa) + (this.yb - this.ya));
    }
}