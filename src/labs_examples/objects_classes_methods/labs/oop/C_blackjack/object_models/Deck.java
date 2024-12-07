package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    private Card[] deck = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList();
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private static int freshDecksLoaded;

    public Deck() {
        loadFreshDeck();
        freshDecksLoaded++;
    }

    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }

    public static int getFreshDecksLoaded() {
        return freshDecksLoaded;
    }

    public static void setFreshDecksLoaded(int freshDecksLoaded) {
        Deck.freshDecksLoaded = freshDecksLoaded;
    }

    private void loadFreshDeck() {
        int count = 0;

        for(int i = 0; i < 4; i++) {
            for(int j = 1; j < 14; j++) {
                if (i == 1) {
                    deck[count] = new Card(suit[i], "ACE");
                } else if (i == 11) {
                    deck[count] = new Card(suit[i], "JACK");
                } else if (i == 12) {
                    deck[count] = new Card(suit[i], "QUEEN");
                } else if (i == 13) {
                    deck[count] = new Card(suit[i], "KING");
                } else {
                    deck[count] = new Card(suit[i], Integer.toString(i).toUpperCase());
                }
                count++;
            }
            System.out.println(suit[i]);
        }
    }

    public boolean isCardUsed(int value) {
        if (usedCards.contains(value)) {
            return true;
        } else {
            return false;
        }
    }

    public Card getCardAt(int randomNum) {
        return deck[randomNum];
    }
}
