package homework16;

import org.psixxo.calc.Calculator;
import org.psixxo.calc.BaseCalc;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new BaseCalc();
        double a = 8.0;
        double b = 4.0;

        System.out.println("Addition: " + calculator.addition(a, b));
        System.out.println("Subtraction: " + calculator.subtraction(a, b));
        System.out.println("Multiplication: " + calculator.multiplication(a, b));
        System.out.println("Division: " + calculator.division(a, b));
        System.out.println("Division by zero: " + calculator.division(a, 0));

    }
}
