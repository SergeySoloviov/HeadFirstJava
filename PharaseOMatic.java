package HeadFirstJava;

/**
 * Created by Сережка on 16.04.2015.
 */
public class PharaseOMatic {
    public static void main(String[] args) {
        String[] wordList1 = {"обернулся", "сделан", "кинулись", "повернул",
                "поднимается", "повернет", "сьехала", "вылетел",
                "оторваться"};
        String[] wordList2 = {"старушка", "бабушка", "человек", "сынок",
                "дочь", "нянька", "царь", "царица", "девушка", "стражники"};
        String[] wordList3 = {"управление", "характерезуется", "номенклатурой", "обьектов",
                "товаров", "грузы", "процесс", "результат", "увеличения", "необходимо",
                "однотипных", "удовлетворять", "задаются"};

        // Вычесляем сколько слов в каждом списке
        int oneLenght = wordList1.length;
        int twoLenght = wordList2.length;
        int threeLenght = wordList3.length;

        // Генерируем три случайных числа
        int rand1 = (int)(Math.random() * oneLenght);
        int rand2 = (int)(Math.random() * twoLenght);
        int rand3 = (int)(Math.random() * threeLenght);

        // Теперь строим фразу
        String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];

        // Выводим фразу на экран
        System.out.println("Все, что нам нужно - это " + phrase);
    }
}
