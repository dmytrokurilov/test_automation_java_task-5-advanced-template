package com.epam.test.automation.java.practice5;

public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        this.sideA = a;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double area() {
        return sideA * sideB;
    }

    public double perimeter() {
        return (sideA + sideB) * 2;
    }

    public boolean isSquare() {
        return sideA == sideB;
    }

    public void replaceSides() {
        double temp = 0;
        temp = sideA;
        sideA = sideB;
        sideB = temp;
    }
}
