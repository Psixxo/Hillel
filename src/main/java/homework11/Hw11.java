package main.java.homework11;

public class Hw11 {
    public static void main(String[] args) {

        Person p1 = new Person("John", 30, "Інженер");
        Person p2 = new Person("Mary", 25, "Вчитель");
        Person p3 = new Person("Bob", 35, "Лікар");

        System.out.println("1. Інформація про осіб:");
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

        System.out.println("\n2. Зміна професії особи:");
        Person p4 = new Person("Alice", 28, "Архітектор");
        p4.printInfo();

        System.out.println("(Після оновлення професії)");
        p4.setProfession("Дизайнер");
        p4.printInfo();
    }
}
class Person {

    private final String name;
    private final int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void printInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }
}