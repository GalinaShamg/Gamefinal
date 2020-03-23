package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameChoice {

    public static boolean checkGame(int gameChoice){
         try {
            Scanner scanner = new Scanner(System.in);
            gameChoice = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Введите число: 1 или 2");
            return false;
        }
        if (gameChoice < 1 || gameChoice >2){
            System.out.println("Введите число: 1 или 2 ");
            return false;
        }
        else { return true;}
    }
}
