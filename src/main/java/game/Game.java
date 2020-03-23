package game;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Game {

    public static void main(String[] args) {
        System.out.println("Здравствуйте, как вас зовут?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        while (!UserReg.checkName(userName)) {
            userName = UserReg.regName();
            User user = new User(userName);
        }
        System.out.println("Давайте поиграем. Выберите игру. Введите на клавиатуре число 1 или 2");
        int gameChoice = 0;
        while (!GameChoice.checkGame(gameChoice)){};

        System.out.println("Отлично, начинаем!");

        if (gameChoice == 1) {
            DoGame.doGame1();
        }
        if (gameChoice == 2) {
            System.out.println("Пора делать другую игру");

        }
        System.out.println("Отлично поиграли. До свидания!");
    }
}


