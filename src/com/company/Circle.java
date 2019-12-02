package com.company;

public class Circle {

    private String name;

    public String getName() {
        return name;
    }

    private int Radius;
    private final double PI = 3.14;

    public Circle(String name, int radius) {
        this.name = name;
        Radius = radius;
    }



    public int getRadius() {
        return Radius;
    }

    public double getPI() {
        return PI;
    }

    public Circle(int radius) {
        this.Radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * Radius;
    }


}
