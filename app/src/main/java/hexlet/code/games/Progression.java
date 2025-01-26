package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    private static final String RULES = "What number is missing in the progression?";

    public static void playing() {
        String[][] gameData = gameDataGeneration();
        Engine.runEngine(RULES, gameData);
    }

    private static String[][] gameDataGeneration() {
        int numberOfRounds = Engine.getNUMBEROFROUNDS();
        String[][] gameData = new String[numberOfRounds][2];
        Random rand = new Random();

        for (int i = 0; i < numberOfRounds; i++) {
            String[] progression = progressionGeneration();
            int unknownNumber = rand.nextInt(0, progression.length);
            gameData[i][1] = progression[unknownNumber];
            progression[unknownNumber] = "..";
            gameData[i][0] = String.join(" ", progression);
        }
        return gameData;
    }

    private static String[] progressionGeneration() {
        Random rand = new Random();
        int sizeProgression = rand.nextInt(5, 11);
        int currentNumber = rand.nextInt(50);
        int step = rand.nextInt(2, 5);

        String[] progression = new String[sizeProgression];
        progression[0] = String.valueOf(currentNumber);

        for (int i = 1; i < sizeProgression; i++) {
            currentNumber += step;
            progression[i] = String.valueOf(currentNumber);
        }
        return progression;
    }
}
