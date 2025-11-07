package main.java.homework13;

public class App {

    public static void main(String[] args) {

        Basic[] basics = {

                new Circle(5),
                new Square(4),
                new Triangle(6, 3)
        };

        double totalArea = calculateTotalArea(basics);
        System.out.println("Total area: " + totalArea);
    }

    private static double calculateTotalArea(Basic[] basics) {

        double sum = 0;
        for (Basic basic : basics) {

            sum += basic.getArea();
        }
        return sum;
    }
}
