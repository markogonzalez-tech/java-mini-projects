import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class AuthSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    register(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static void login(Scanner scanner) {
        System.out.print("Username: ");
        String inputUser = scanner.nextLine();

        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

        boolean accessGranted = false;

        try {
            File file = new File("data/users.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String[] parts = fileScanner.nextLine().split(",");

                if (parts[0].equals(inputUser) && parts[1].equals(inputPassword)) {
                    accessGranted = true;
                    break;
                }
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("User file not found.");
        }

        if (accessGranted) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
    }

    public static void register(Scanner scanner) {
        System.out.print("New username: ");
        String newUser = scanner.nextLine();

        System.out.print("New password: ");
        String newPassword = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("data/users.txt", true);
            writer.write(newUser + "," + newPassword + "\n");
            writer.close();

            System.out.println("User registered successfully");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
