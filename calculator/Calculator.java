import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.println("Sum: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if(b != 0){
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }

        scanner.close();
    }
}
