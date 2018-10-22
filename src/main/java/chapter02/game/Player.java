package chapter02.game;

import java.util.Objects;

public class Player {
     int number = 0;

    public void guess() {
        number = (int)(Math.random() * 10);
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return  Integer.toString(number);
    }
}
