package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playing() {
        String[][] gameData = gameDataGeneration();
        Engine.runEngine(RULES, gameData);
    }

    private static String[][] gameDataGeneration() {
        int numberOfRounds = Engine.getNUMBEROFROUNDS();
        String[][] gameData = new String[numberOfRounds][2];
        Random rand = new Random();

        for (int i = 0; i < numberOfRounds; i++) {
            int randNumber = rand.nextInt(100);
            gameData[i][0] = String.valueOf(randNumber);
            gameData[i][1] = isPrime(randNumber) ? "yes" : "no";
        }
        return gameData;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
