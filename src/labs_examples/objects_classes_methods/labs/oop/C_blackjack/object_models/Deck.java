package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
                if (j == 1) {
                    deck[count] = new Card(suit[i], "ACE");
                } else if (j == 11) {
                    deck[count] = new Card(suit[i], "JACK");
                } else if (j == 12) {
                    deck[count] = new Card(suit[i], "QUEEN");
                } else if (j == 13) {
                    deck[count] = new Card(suit[i], "KING");
                } else {
                    deck[count] = new Card(suit[i], Integer.toString(j).toUpperCase());
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
    public void deal(CardPlayer player) {
//        int randomNum = getRandomCard();
//        Card card = getCardAt(randomNum);

        player.getHand().add(getCardAt(getRandomCard()));
    }

    private int getRandomCard() {
        Random random = new Random();

        int n = random.nextInt(51) + 0;

        while(isCardUsed(n)) {
            n = random.nextInt(51) + 0;
        }
        getUsedCards().add(n);
        return n;
    }
}

/*
If/when the random number has not yet been played add the card at the index
of random num from the Cards[] to the player's "Hand" ArrayList, then add that random number to the ArrayList<Integer>
called usedCards in the Deck class. This usedCards arraylist tracks the cards that have already been dealt.
 */
