package main.java.homework13;

public class Square extends Basic {

    private final double side;

    public Square(double side) {

        this.side = side;
    }

    @Override
    public double getArea() {

        return side * side;
    }
}
