package day36_inheritance.shapes;

import java.util.Scanner;

public class Shape {
    //Instance variable
    String name;

    public Shape(String name) {
        this.name = name;
    }


    // Instance method called area();
    public double area(){
        return 0.0;
    }

    // Instance method called perimeter();
    public double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }


}