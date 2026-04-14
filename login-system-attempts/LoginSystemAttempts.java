import java.util.Scanner;

public class LoginSystemAttempts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUser = "admin";
        String correctPassword = "1234";

        int attempts = 3;
        boolean accessGranted = false;

        while (attempts > 0) {
            System.out.print("Username: ");
            String user = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (user.equals(correctUser) && password.equals(correctPassword)) {
                System.out.println("Access granted");
                accessGranted = true;
                break;
            } else {
                attempts--;
                System.out.println("Incorrect credentials. Attempts left: " + attempts);
            }
        }

        if (!accessGranted) {
            System.out.println("Account locked. Too many failed attempts.");
        }

        scanner.close();
    }
}
