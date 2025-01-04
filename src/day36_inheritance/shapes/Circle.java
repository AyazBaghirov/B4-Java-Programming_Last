package day36_inheritance.shapes;

public class Circle extends Shape {

    // Instance Variable
    double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area(){
        //return radius * radius * 3.14;
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter(){
        return 2 * radius * Math.PI;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}