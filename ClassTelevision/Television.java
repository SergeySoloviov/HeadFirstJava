package HeadFirstJava.ClassTelevision;

/**
 * Created by Сережка on 17.04.2015.
 */
public class Television {
    int size;
    int coutnChannel;
    String color;

    public Television(int size, int coutnChannel, String color) {
        this.size = size;
        this.coutnChannel = coutnChannel;
        this.color = color;
    }

    void show() {
        System.out.println("Я могу показывать " + coutnChannel + " каналов.");
    }

    String setColor() {
        return "Я " + color + " цвета.";
    }

    String size() {
        return "Мой размер: " + size;
    }
 }
