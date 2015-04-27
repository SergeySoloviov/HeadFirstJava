package HeadFirstJava.DotCom;

import java.util.ArrayList;

/**
 * Created by Сережка on 20.04.2015.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println(name + " ушел на дно!");
            }
            else {
                result = "Попал";
            }
        }
        return result;
    }
}
