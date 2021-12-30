package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import java.util.Random;

public class colorPicker {
    public static Color  colorPicker() {
        Random temp = new Random();

        int number = temp.nextInt(4);

        System.out.println(number);

        if (number == 3) {
            return Color.RED;
        }
        else if (number == 2) {
            return Color.YELLOW;
        }
        else if (number == 1) {
            return Color.BLUE;
        }
        else {
            return Color.WHITE;
        }
    }
}
