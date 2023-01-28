package Lessons.Lesson19.pocker;

public class Card {
    String value;
    String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
