package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;

import java.util.Arrays;

public class Card {
     private char suit;
     private String value;
     private int scoreValue;

    public Card(char suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public Card(char[] suit, String ace) {

    }

    public String customToString() {
        return suit + value + suit;
    }

    public int getScoreValue() {

        try {
            return Integer.valueOf(value);
        } catch (Exception e) {
            if (value.equalsIgnoreCase("ACE")) {
                return 11;
            } else {
                return 10;
            }
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value='" + value + '\'' +
                ", scoreValue=" + scoreValue +
                '}';
    }
}
