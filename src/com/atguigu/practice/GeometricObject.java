package com.atguigu.practice;

public class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject(){
    }

    public GeometricObject(String color,double weight){
        this.color=color;
        this.weight=weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public double findArea(){
        return 0.0;
    }

}