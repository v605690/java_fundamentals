package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }
}
