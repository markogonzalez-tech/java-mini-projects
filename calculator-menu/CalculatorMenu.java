import java.util.Scanner;

public class CalculatorMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- CALCULATOR ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            option = scanner.nextInt();

            if(option >= 1 && option <= 4){

                System.out.print("Enter first number: ");
                double a = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double b = scanner.nextDouble();

                switch(option){
                    case 1: System.out.println("Result: " + (a + b)); break;
                    case 2: System.out.println("Result: " + (a - b)); break;
                    case 3: System.out.println("Result: " + (a * b)); break;
                    case 4:
                        if(b != 0){
                            System.out.println("Result: " + (a / b));
                        } else {
                            System.out.println("Cannot divide by zero");
                        }
                        break;
                }
            }

        } while(option != 0);

        scanner.close();
    }
}
