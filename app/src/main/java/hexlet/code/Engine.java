package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static String userName;
    private static final int NUMBER_OF_ROUNDS = 3;

    public static void runEngine(String rulesGame, String[][] gameData) {
        greeting();
        System.out.println(rulesGame);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            String answer = SCANNER.next();

            if (answer.equals(gameData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gameData[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    private static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static int getNUMBEROFROUNDS() {
        return NUMBER_OF_ROUNDS;
    }
}
