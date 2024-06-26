package InhertancePolymophism.baithCircle;

import AnimalInterface_Edible.InterFaceBT.Resizeable;

public class Circle extends Shape  {
    private double radius = 1.0;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color,boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;

    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return " a circle with radius " + getRadius() + getArea();
    }



}
class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2);
        System.out.println(circle);
        circle = new Circle(3.0,"blue",false);
        System.out.println(circle);
    }
}
