package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException {

        Parallelepiped par = new Parallelepiped();
        Sphere sphere = new Sphere();
        Cylinder cylinder = new Cylinder();
        Cone cone = new Cone();
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Введите фигуру:");
                String name = input.next();
                if (!name.matches("[a-zA-Za-яА-Я]*")) {
                   throw new MyException("Введите название фигур буквами");
                }
                switch (name) {
                    case ("Паралеллепипед"):
                        System.out.println("Введите длину");
                        int length = input.nextInt();
                        System.out.println("Введите ширину");
                        int width = input.nextInt();
                        par.getCalculate(length, width);
                        break;
                    case ("Сфера"):
                        System.out.println("Введите радиус: ");
                        int radius = input.nextInt();
                        sphere.getCalculate(name, radius);
                        break;
                    case ("Цилиндр"):
                        System.out.println("Введите радиус:");
                        int radiusOfCylinder = input.nextInt();
                        System.out.println("Введите высоту: ");
                        int highOfCylinder = input.nextInt();
                        cylinder.getCalculate(name, radiusOfCylinder, highOfCylinder);
                        break;
                    case ("Конус"):
                        System.out.println("Введите радиус:");
                        int radiusOfCone = input.nextInt();
                        System.out.println("Введите высоту: ");
                        int highOfCone = input.nextInt();
                        cone.getCalculate(name, radiusOfCone, highOfCone);
                        break;
                    default:
                        System.err.println("Нет такой фигуры!");
                }
            } catch (MyException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Параметры задаются в числах");
            }
        }
    }
}


