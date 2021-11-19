package com.company;

public class Parallelepiped {
    private String name;
    private int length;
    private int width;

    public Parallelepiped() {

    }
        public Parallelepiped(String nameInput, int lengthInput, int widthInput) {
        this.name = nameInput;
        this.length = lengthInput;
        this.width = widthInput;

    }
    public void getCalculate(int length, int width) throws MyException {

        if (length < 0) {
            throw new MyException("Параметры не могут быть отрицательными!");
        }
        if (width < 0) {
            throw new MyException("Параметры не могут быть отрицательными!");
        }
        System.out.println("S паралеллипеда равна: " + (length * width));
    }
}