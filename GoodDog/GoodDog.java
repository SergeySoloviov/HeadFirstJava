package HeadFirstJava.GoodDog;

/**
 * Created by Сережка on 17.04.2015.
 */
public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Гав Гав!!!");
        }
        else
            if (size > 14) {
                System.out.println("Вуф Вуф!!!");
            }
        else {
                System.out.println("Тяф Тяф!!!");
            }
    }
}
