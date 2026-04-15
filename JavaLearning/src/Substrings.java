import java.sql.SQLOutput;
import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email daxil edin!: ");
        String email = scanner.nextLine();

        String username = email.substring(0, email.indexOf("@"));
        String mail = email.substring(email.indexOf("@") + 1);

        System.out.println("Your email is " + mail + "\n" + "Your username is " + username);
        scanner.close();

    }
}
