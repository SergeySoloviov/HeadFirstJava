package HeadFirstJava.GameOfGuessing;

import java.util.Scanner;

/**
 * Created by Сережка on 17.04.2015.
 */
public class Player {
    int playerNumber;
    String name;
    int age;

    public Player(int playerNumber, String name, int age) {
        this.playerNumber = playerNumber;
        this.name = name;
        this.age = age;
    }
    public int guess() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
