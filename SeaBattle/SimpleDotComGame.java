package HeadFirstJava.SeaBattle;

import java.util.Scanner;

/**
 * Created by Сережка on 18.04.2015.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom simpleDotCom = new DotCom();
        int randomNum = (int)(Math.random() * 5);
        int[] array = {randomNum, randomNum + 1, randomNum + 2,};
//        simpleDotCom.setLocationCells(array);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = simpleDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось" + numOfGuesses + "попыток(и)");
            }
        }
    }
}
