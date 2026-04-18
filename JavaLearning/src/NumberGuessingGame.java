import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(1, 10);
        int guess;
        int attempts = 0;

        System.out.print("Enter the guess: ");
        guess = scanner.nextInt();
        if (guess != number) {
            while (guess != number) {
                if (guess > number) {
                    System.out.println("TOO HIGH! TRY AGAIN");
                } else if (guess < number) {
                    System.out.println("TOO LOW! TRY AGAIN");
                }
                attempts++;
                guess = scanner.nextInt();
            }
            System.out.println("GOOD JOB YOU FOUND IT!");
        } else {
            System.out.println("GOOD JOB! YOU FOUND IT IN FIRST TRY!");
        }
        System.out.println(attempts);
    }
}