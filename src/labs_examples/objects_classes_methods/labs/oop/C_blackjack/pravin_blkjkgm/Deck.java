package labs_examples.objects_classes_methods.labs.oop.C_blackjack.pravin_blkjkgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    private Card[] cards = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList<>();

    public void myDeck() {
        loadDeck();
    }

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    public Card obj = new Card();

    private void loadDeck() {
        int count = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                if (j == 1) {
                    cards[count] = new Card(obj.getSuit()[i], "ACE");
                } else if (j == 11) {
                    cards[count] = new Card(obj.getSuit()[i], "JACK");
                } else if (j == 12) {
                    cards[count] = new Card(obj.getSuit()[i], "QUEEN");
                } else if (j == 13) {
                    cards[count] = new Card(obj.getSuit()[i], "KING");
                } else {
                    cards[count] = new Card(obj.getSuit()[i], Integer.toString(j).toUpperCase());
                }
                count++;
            }
            System.out.println(obj.getSuit()[i]);
        }
    }

    public void deal(Player player) {
        player.getHand();
    }

    public boolean isCardUsed(int value) {
//        if (usedCards.contains(value)) {
//            return true;
//        } else {
//            return false;
//        }
        return usedCards.contains(value);
    }

    public Card getCardAt(int randNum) {
        return cards[randNum];
    }

    private int getRandCard() {
        Random random = new Random();

        int n = random.nextInt(52) + 1;

        while (isCardUsed(n)) {
            n = random.nextInt(52) +1;
        }
        return n;
    }
}

