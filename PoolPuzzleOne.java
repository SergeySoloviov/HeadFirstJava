package HeadFirstJava;

/**
 * Created by Сережка on 16.04.2015.
 */
public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;

        while (x < 4) {
            System.out.println("a ");
            if (x < 1) {
                System.out.println("noise");
            }
            x = x + 2;

            if (x > 0) {
                System.out.println("annoys");
                x = x - 1;
            }
            if (x == 1) {

            }
        }
    }
}
