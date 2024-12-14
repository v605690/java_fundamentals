package labs_examples.objects_classes_methods.labs.oop.C_blackjack.pravin_blkjkgm;

import java.util.Arrays;

public class Card {

    private char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private int cardValue;

    public Card(char[] suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Card(char c, String ace) {

    }

    public Card() {

    }

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + Arrays.toString(suit) +
                ", cardValue=" + cardValue +
                '}';
    }
}
