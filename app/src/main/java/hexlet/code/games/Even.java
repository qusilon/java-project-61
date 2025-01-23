package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

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
            gameData[i][1] = randNumber % 2 == 0 ? "yes" : "no";
        }
        return gameData;
    }
}
