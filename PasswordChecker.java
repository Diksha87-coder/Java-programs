
import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() >= 8) {
            System.out.println("Password Length is Strong");
        } else {
            System.out.println("Password is Too Short");
        }

        sc.close();
    }
}
