package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_RAND_NUMBER = 100;
    private static final int COUNT_SIGN = 3;

    public static void playing() {
        String[][] gameData = gameDataGeneration();
        Engine.runEngine(RULES, gameData);
    }

    private static String[][] gameDataGeneration() {
        int numberOfRounds = Engine.getNUMBEROFROUNDS();
        String[][] gameData = new String[numberOfRounds][2];
        Random rand = new Random();

        for (int i = 0; i < numberOfRounds; i++) {
            String sing = getSign();
            int randNumberOne = rand.nextInt(MAX_RAND_NUMBER);
            int randNumberTwo = rand.nextInt(MAX_RAND_NUMBER);
            gameData[i][0] = randNumberOne + " " + sing + " " + randNumberTwo;
            gameData[i][1] = String.valueOf(getResult(sing, randNumberOne, randNumberTwo));
        }
        return gameData;
    }

    private static String getSign() {
        Random rand = new Random();
        int signNumber = rand.nextInt(COUNT_SIGN);
        switch (signNumber) {
            case 0:
                return "+";
            case 1:
                return "-";
            default:
                return "*";
        }
    }

    private static int getResult(String sign, int numberOne, int numberTwo) {
        switch (sign) {
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            default:
                return numberOne * numberTwo;
        }
    }
}
