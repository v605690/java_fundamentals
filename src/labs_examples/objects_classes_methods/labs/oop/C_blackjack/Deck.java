package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    static Card[] cards;
    ArrayList<Integer> usedCards;

//    public void myDeck() {
//        Card[] cards = new Card[52];
//
//        int index = 0;
//        for (char suit = 0; suit <= 3; suit++) {
//            for (int cardValue = 1; cardValue <= 13; cardValue++) {
//                cards[index] = new Card((char) suit, cardValue);
//                index++;
//            }
//        }
//        for(Card c : cards) {
//            System.out.println(c);
//        }
//    }

    public static void cardDesk() {
        cards = new Card[52];
        int index = 0;

        for (char i = 0; i < 4; i++) {
            for(int j = 1; j <= 13; j++) {
                cards[index] = new Card((char) i, j);
                index++;
            }
        }
        for(Card card : cards) {
            System.out.println(card);
        }
    }

    public static void printDeckCards(Card[] cards) {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    public Deck() {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Card[] getCard() {
        return cards;
    }

    public void setCard(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "card=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }
}
