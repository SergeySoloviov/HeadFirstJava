package HeadFirstJava.GameOfGuessing;

import java.util.Scanner;

/**
 * Created by Сережка on 17.04.2015.
 */
public class GuessGame {
    public void startGame() {
        Player playerOne = new Player(1, "Сергей", 28);
        Player playerTwo = new Player(2, "Иван", 30);
        Player playerThree = new Player(3, "Васыль", 22);

        int NUMBER = (int) (Math.random() * 8 + 1);

            test(playerOne, NUMBER);
            test(playerTwo, NUMBER);
            test(playerThree, NUMBER);

    }
    public boolean test(Player player, int NUMBER) {
        while (true) {
            System.out.println("Введите число: ");
            if (NUMBER == player.guess()) {
                return true;
            } else {
                System.out.println("К сожалению Вы не угадали число.");
                System.out.println("Очередь угадывать переходит следующему игроку");
            }
        }
    }
}

