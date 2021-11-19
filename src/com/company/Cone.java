package com.company;

public class Cone {
    private String name;
    private int radius;
    private int high;

    public Cone() {
    }

    public Cone(String name, int radius, int high) {
        this.name = name;
        this.radius = radius;
        this.high = high;
    }

    public void getCalculate(String name, int radius, int high) throws MyException {
        if (radius < 0) {
            throw new MyException("Параметры не могут быть отрицательными!");
        }
        if (high < 0) {
            throw new MyException("Параметры не могут быть отрицательными!");
        }
        double squareOfCone = (Math.PI * Math.pow(radius, 2));
        double volumeOfCone = (high / 3) * Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь конуса: " + (Math.round(squareOfCone)));
        System.out.println("Обьем конуса: " + (Math.round(volumeOfCone)));
    }
}