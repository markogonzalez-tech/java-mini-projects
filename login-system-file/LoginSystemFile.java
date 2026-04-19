import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LoginSystemFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String inputUser = scanner.nextLine();

        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

        boolean accessGranted = false;

        try {
            File file = new File("data/users.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                String user = parts[0];
                String password = parts[1];

                if (inputUser.equals(user) && inputPassword.equals(password)) {
                    accessGranted = true;
                    break;
                }
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("User file not found.");
        }

        if (accessGranted) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        scanner.close();
    }
}
