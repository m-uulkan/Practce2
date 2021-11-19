package com.company;

public class Cylinder {
    private String name;
    private int radius;
    private int high;

    public Cylinder() {
    }
    public Cylinder(String name, int radius, int high) {
        this.name = name;
        this.radius = radius;
        this.high = high;
    }

   public void getCalculate(String name,int radius,int high) throws MyException {
       if(radius<0){
                        throw new MyException("Параметры не могут быть отрицательными!");
                    }
                    System.out.println("Введите высоту:");

                    if(high<0){
                        throw new  MyException("Параметры не могут быть отрицательными!");
                    }
                    double squareOfCylinder=(Math.PI*Math.pow(radius,2));
                    double volumeOfCylinder=(Math.PI*Math.pow(radius,2)*high);
                    System.out.println("Площадь цилиндра: "+(Math.round(squareOfCylinder)));
                    System.out.println("Обьем цилиндра: "+(Math.round(volumeOfCylinder)));
   }
}
