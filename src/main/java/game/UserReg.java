package game;

import java.util.Scanner;
import java.util.regex.Pattern;



public class UserReg {
    public static boolean checkName(String name){
        if(name.equals("")){
            System.out.println("Пустое имя, введите имя! ");
            return false;
        }
        else if(name.contains("0")|| name.contains("1")|| name.contains("2") || name.contains("3")
        || name.contains("4") || name.contains("5") || name.contains("6") || name.contains("7")
                || name.contains("8")||name.contains("9")){
            System.out.println("Введите имя без цифр! ");
            return false;
        }
        else if (name.contains("выйти")){
            System.exit(0);
            return true;
            }
        else {

          System.out.println("Отлично! Здравствуйте "+name.substring(0,1).toUpperCase()+ removeCharAt(name, 0));
            return true;
        }
    }

    private static String removeCharAt(String name, int i) {
        return name.substring(0, i) + name.substring(i + 1);
    }

    public static String regName(){
        System.out.println("Здравствуйте, введите свое имя!");
        return new Scanner(System.in).nextLine();
    }
}
