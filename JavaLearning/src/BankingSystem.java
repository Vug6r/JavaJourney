import java.util.Scanner;

public class BankingSystem {
    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        double balance = 1000.0;
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("Choose process: ");
            System.out.println("1: Show Balance");
            System.out.println("2: Deposit Money");
            System.out.println("3: Withdraw Money");
            System.out.println("4: Exit");

            int process = scanner.nextInt();

            switch (process) {
                case (1) -> showBalance(balance);
                case (2) -> balance = balance + deposit();
                case (3) -> balance = balance - withdraw();
                case (4) -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }

    }
    static void showBalance(double balance){
        System.out.printf("Your balance is %.2f\n", balance);
    }
    static double deposit() {
        double amount;
        System.out.println("Enter the deposit amount: ");
        amount = scanner.nextDouble();
        if(amount > 0) {
            return amount;
        }
        else {
            System.out.println("Can't deposit negative number!");
            return 0;
        }
    }
    static int withdraw() {
        int take;
        System.out.println("Enter the withdrawn amount: ");
        take = scanner.nextInt();
        return take;
    }
}

