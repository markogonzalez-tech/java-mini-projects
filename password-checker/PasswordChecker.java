import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if(password.length() >= 8){
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }

        scanner.close();
    }
}
