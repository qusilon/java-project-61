package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner.next();
        System.out.println();

        switch (choice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.playing();
                break;
            case "3":
                Calc.playing();
                break;
            case "4":
                GCD.playing();
                break;
            case "5":
                Progression.playing();
                break;
            default:
                break;
        }

        scanner.close();
    }
}
