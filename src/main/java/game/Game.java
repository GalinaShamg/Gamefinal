package game;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Game{

    public static void main(String[] args) {
        System.out.println("Здравствуйте, как вас зовут?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        while (!UserReg.checkName(userName)) {
            userName = UserReg.regName();
            User user = new User(userName);
        }

        System.out.println("Давайте поиграем. Выберите игру. Введите на клавиатуре или \"угадать число\" или \"загадать число\"");
        String dgame1 = "угадать число";
        String dgame2 = "загадать число";
        String gameChoice = scanner.nextLine();
        while(!(gameChoice.equals(dgame1) || gameChoice.equals(dgame2))){
            if (gameChoice.equals("выйти")){
                System.out.println("До свидания");
                System.exit(0);
            }
            System.out.println("Введите на клавиатуре или \"угадать число\" или \"загадать число\"");
            gameChoice = scanner.nextLine();
        }

regChoice(gameChoice, dgame1, dgame2);


        System.out.println("Отлично поиграли. До свидания!");
    }
    public static void regChoice(String gameChoice, String dgame1, String dgame2){
        if (gameChoice.equals(dgame1)) {
            DoGame.doGame1();
        }
        if (gameChoice.equals(dgame2)) {
            DoGame.doGame2();
        }
    }

 /*   public void exit(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.nextLine().contains("выйти")) {
            System.out.println("До свидания");
            break;
        }
    } */
}


