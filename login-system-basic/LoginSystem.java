import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUser = "admin";
        String correctPassword = "1234";

        System.out.print("Usuario: ");
        String user = scanner.nextLine();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        if(user.equals(correctUser) && password.equals(correctPassword)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        scanner.close();
    }
}
