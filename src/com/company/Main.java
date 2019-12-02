package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("Круг",4);
        circle.calculatePerimeter();
        System.out.println(circle.getName() + "с периметром" + circle.calculatePerimeter());

        Square square = new Square("Квадрат",5);
        square.calculatePerimeter(5);
        System.out.println(square.getName() + "с периметром" + square.calculatePerimeter(5));


        // write your code here

};

}
