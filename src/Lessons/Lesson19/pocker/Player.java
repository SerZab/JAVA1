package Lessons.Lesson19.pocker;

import java.util.Arrays;
public class Player {
    String name;

    Card[] playersCards = new Card[5];
    
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playersCards=" + Arrays.toString(playersCards) +
                '}';
    }

}
