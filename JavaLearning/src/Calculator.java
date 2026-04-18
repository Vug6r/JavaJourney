import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean statement = true;

        System.out.println("Enter the first digit: ");
        double first = scanner.nextDouble();
        System.out.println("Enter the process: ");
        String process = scanner.next();
        System.out.println("Enter the second digit: ");
        double second = scanner.nextDouble();

        switch (process){
            case "+" -> System.out.println(first + second);
            case "*" -> System.out.println(first * second);
            case "/" -> {
                if (second == 0){
                    System.out.println("Sıfıra bölünməz");
                    statement = false;
                }
                else {
                    System.out.println(first / second);
                }
            }
            case "-" -> System.out.println(first - second);
            default -> System.out.println("Duzgun yaz!");

        }
    }
}
