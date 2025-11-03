package main.java.homework12;

public record Employee(String firstName, String secondName, String lastName, String position, String email,
                       String phone, int age) {

    public void printInfo() {
        System.out.println("Прізвище: " + firstName);
        System.out.println("Ім'я: " + secondName);
        System.out.println("По-батькові: " + lastName);
        System.out.println("Посада: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Вік: " + age);
    }
}
