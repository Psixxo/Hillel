package main.java.homework14;

public class Main {

    public static void main(String[] args) {

        Printer printer = new App();

        App.Message msg1 = new App.Message("Тестове" , "Микита");
        printer.print(msg1);

        App.Message msg2 = new App.Message("Анон" , "");
        printer.print(msg2);

        App.Message msg3 = new App.Message("" , "");
        printer.print(msg3);

    }
}
