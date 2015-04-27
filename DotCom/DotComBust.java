package HeadFirstJava.DotCom;

import java.util.ArrayList;

/**
 * Created by Сережка on 20.04.2015.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame() {
      DotCom one = new DotCom();
        one.setName("\"Aдмирал Бутаков\"");
      DotCom two = new DotCom();
        two.setName("\"Адмирал Чичагов\"");
      DotCom three = new DotCom();
        three.setName("\"Адмирал Грейг\"");

        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Ваша цель - потопить три коробля.");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все коробли потоплены!");
        if (numOfGuesses < 15) {
            System.out.println("Хороший результат. Вы сделали: " + numOfGuesses + " ходов.");
        }
        else {
            System.out.println("Вы сделали: " + numOfGuesses + " ходов.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }


}
