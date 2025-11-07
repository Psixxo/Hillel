package main.java.homework13;

public class Circle extends Basic {

    private final double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }
}
