import java.sql.SQLOutput;
import java.util.Scanner;

public class Skan {
    public static void main(String[] args) {
        double height = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the height: ");
        height = scanner.nextDouble();
        System.out.println("What is the width: ");
        width = scanner.nextDouble();
        area = width * height;
        System.out.println(area);

        scanner.close();
    }
}