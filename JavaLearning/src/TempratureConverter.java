import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the temprature: ");
        double temp = scanner.nextDouble();

        System.out.println("Which one you want to convert to?");
        System.out.println("1. C to F or 2. F to C");

        int choice = scanner.nextInt();

        double answer = (choice == 1) ? temp * 12.4 : temp * 1;
        System.out.printf("%.0f", answer);


    }
}