package labs_examples.objects_classes_methods.labs.oop.C_blackjack.pravin_blkjkgm;

public class Player {
    String name;
    Hand hand;
    int potValue;
    private Hand[] cards;

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }

    public Hand[] getCards(Hand[] cards) {
        return cards;
    }

    public void setCards(Hand[] cards) {
        this.cards = cards;
    }

    public Hand[] getCards() {

        return new Hand[0];
    }
}
