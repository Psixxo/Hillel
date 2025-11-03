package main.java.homework12;

public class App {

    public static void main(String[] args) {

        Employee emp = new Employee("Петров", "Олександр", "Олександрович",
                "Бухгалтер", "petrov1222@gmail.com", "+380991234567", 25);
        emp.printInfo();

        System.out.println();

        Car car = new Car();
        car.start();
    }
}
