import java.util.Scanner;

public class SymbolMatrix {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Columns: ");
        int rows = scanner.nextInt();
        System.out.print("Rows: ");
        int columns = scanner.nextInt();
        System.out.print("What to print: ");
        char p = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++ ) {
            for (int j = 0; j < columns; j++){
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
