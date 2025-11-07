package main.java.homework13;

public class Triangle extends Basic {

    private final double a;
    private final double b;

    public Triangle(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {

        return 0.5 * a * b;
    }
}
