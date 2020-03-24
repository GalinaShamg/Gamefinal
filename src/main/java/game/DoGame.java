package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DoGame {

    public static void doGame1() {
        Scanner scanner = new Scanner(System.in);
        int num = 5;
        System.out.println("Игра Угадай число. Отгадайте, какое число от 0 до 100 загадал компьютер");
            int guessNum = scanner.nextInt();

            while (guessNum != num) {
                if (guessNum > num) {
                    System.out.println("Ваше число больше задуманного. Попробуйте еще");
                    guessNum = scanner.nextInt();
                }
                if (guessNum < num) {
                    System.out.println("Ваше число меньше задуманного. Попробуйте еще");
                    guessNum = scanner.nextInt();
                }
            }

            System.out.println("Здорово! Сыграем еще? Введите на клавиатуре или \"угадать число\" или \"загадать число\"");
            scanner.nextLine();
            String gameChoice11 = scanner.nextLine();
            String dgame111 = "угадать число";
            String dgame222 = "загадать число";
            Game.regChoice(gameChoice11, dgame111, dgame222);
        }

    public static void doGame2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Загадать число\". Загадайте число от 0 до 100. Когда загадаете, напечатайте \"загадал\"");
        String yes = scanner.nextLine();
        String yes1 = "загадал";
        while(!yes.equals(yes1)){
            System.out.println("Когда загадаете, напечатайте \"загадал\"");
            yes = scanner.nextLine();
        }
        if (yes.equals(yes1)) {
            System.out.println("Хорошо!");
            int num = 0;
            System.out.println(num + " - если число большое, введите слово \"больше\", если вы загадали это число, введите слово \"правильно\"");
            String answer = scanner.nextLine();
            String more = "больше";
            String right = "правильно";
            while (!answer.equals(right)) {
                num += 1;
                System.out.println(num + " - если число большое, введите слово \"больше\", если вы загадали это число, введите слово \"правильно\"");
                answer = scanner.nextLine();
            }
            System.out.println("Здорово! Сыграем еще? Введите на клавиатуре или \"угадать число\" или \"загадать число\"");
        }
            String gameChoice = scanner.nextLine();
            String dgame11 = "угадать число";
            String dgame22 = "загадать число";
            Game.regChoice(gameChoice, dgame11, dgame22);
   }
}




