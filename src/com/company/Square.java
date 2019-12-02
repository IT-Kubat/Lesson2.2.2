package com.company;

public class Square {

    String name;

    public String getName() {
        return name;
    }

    int sideA;

    public Square(String name, int sideA) {
        this.name = name;
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public int calculatePerimeter (int sideA){
        return 4*sideA;
    }
}
