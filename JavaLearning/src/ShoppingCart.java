import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int howMany = 0;
    String item = "";
    double price = 0;

        System.out.println("What item?: ");
    item = scanner.nextLine();
        System.out.println("How many?: ");
    howMany = scanner.nextInt();
        System.out.println("Price?: ");
    price = scanner.nextDouble();

    double hesab = howMany * price;
        System.out.println("You wanna buy "+howMany+" " + item + " for "+ hesab);
    }
}
