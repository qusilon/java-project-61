package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {

    private static final Scanner scanner = new Scanner(System.in);
    private static String userName;

    public static void playing() {
        Random rand = new Random();

        int n = 0;
        int randNumber;
        String answer;
        greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (n < 3) {
            randNumber = rand.nextInt(100);
            System.out.println("Question: " + randNumber);
            System.out.print("Your answer: ");
            answer = scanner.next();

            if ((randNumber % 2 == 0 && answer.equals("yes")) || (randNumber % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            n++;
        }

        if (n == 3)
            System.out.println("Congratulations, " + userName + "!");
    }

    private static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
