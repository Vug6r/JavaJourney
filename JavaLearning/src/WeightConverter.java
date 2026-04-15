import java.util.Scanner;


public class WeightConverter {
    public static void main(String[] args) {
        double lbs;
        double kg;

        System.out.println("Hello! Please choose which one you want to convert from: 1. LBS to KG 2. KG to LBS");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Please enter your digit: ");
        double converged = scanner.nextDouble();

        double results = (number == 1) ? converged * 2.30 : converged * 2;
        System.out.println(results);
    }
}
