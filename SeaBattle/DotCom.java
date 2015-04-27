package HeadFirstJava.SeaBattle;

import java.util.ArrayList;

/**
 * Created by Сережка on 18.04.2015.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    int numOfHits = 0;

    String checkYourself(String stringuess) {
        int index = locationCells.indexOf(stringuess);
        String result = "Мимо";
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил!";
            } else {
                result = "Попал";
            }
        }
        return result;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }
}
