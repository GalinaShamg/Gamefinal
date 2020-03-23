package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DoGame{
    int guessNum;
    int num;
       Scanner scanner = new Scanner(System.in);
    public static void doGame1() {
       int num=5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра Угадай число. Отгадайте, какое число от 0 до 100 загадал компьютер");
        int guessNum = scanner.nextInt();
        while (!DoGame.checkguessNum(guessNum)) {
compareNum(guessNum, num);
        }
    }
        public static boolean compareNum(int guessNum, int num){
            Scanner scanner = new Scanner(System.in);
            if (guessNum > num) {
                System.out.println("Загаданное число меньше вашего, попробуйте еще раз ");
                guessNum = scanner.nextInt();
                return false;
            } else if (guessNum < num) {
                System.out.println("Загаданное число больше вашего, попробуйте еще раз ");
                guessNum = scanner.nextInt();
                return false;

            } else {
                System.out.println("Вы угадали. Сыграем в следующую игру. Если да? введите цифру 2 ");
           return true;
            }
        }

        public static boolean checkguessNum ( int guessNum){
            try {
                Scanner scanner = new Scanner(System.in);
                guessNum = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели что-то не то, введите число");
                return false;
            }
            return true;
        }
    }

