package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {

    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void playing() {
        String[][] gameData = gameDataGeneration();
        Engine.runEngine(RULES, gameData);
    }

    private static String[][] gameDataGeneration() {
        int numberOfRounds = Engine.getNUMBEROFROUNDS();
        String[][] gameData = new String[numberOfRounds][2];
        Random rand = new Random();

        for (int i = 0; i < numberOfRounds; i++) {
            int randNumberOne = rand.nextInt(100);
            int randNumberTwo = rand.nextInt(100);
            gameData[i][0] = randNumberOne + " " + randNumberTwo;
            gameData[i][1] = String.valueOf(gcd(randNumberOne, randNumberTwo));
        }
        return gameData;
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
