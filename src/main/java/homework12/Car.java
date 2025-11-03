package main.java.homework12;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Запуск електрики.");
    }

    private void startCommand() {
        System.out.println("Команда на запуск.");
    }

    private void startFuelSystem() {
        System.out.println("Запуск паливної системи.");
    }
}
