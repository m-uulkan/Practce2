package com.company;

public class Sphere {


    private String name;
    private int radius;

    public Sphere() {
    }
    public Sphere(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }
    public void getCalculate(String name,int radius) throws MyException {
        if(radius<0){
            throw new MyException("параметры не могут быть отрицательными");
        }
        double result=(4/3*Math.PI*Math.pow(radius,3));
        System.out.println("Сфера равна: "+Math.round(result));
    }

}