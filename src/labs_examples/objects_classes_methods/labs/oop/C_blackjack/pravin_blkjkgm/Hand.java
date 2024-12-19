package labs_examples.objects_classes_methods.labs.oop.C_blackjack.pravin_blkjkgm;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private String handValue;

    public Hand(ArrayList<Card> cards, String handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }

    private void scoreHand(Player user, Player computer) {

        int computerScore = computerHand(computer);
        int userScore = computerHand(user);

        int computerDiff = 21 - computerScore;
        int userDiff = 21 - userScore;

        String computerHand = computer.getHand().toString();
        String output = "";

        if(computerScore == 21 && userScore == 21) {
            output = "\nYOU TIED!! I (Computer) scored " + computerScore + " with " + computerHand;
            user.setPotValue(user.getStackValue() - (user.getBet() / 2));
            printUserChipBalance(user);
        } else if (computerScore == 21 ) {
            output = "\nYOU LOSE!! I (Computer) landed 21 with " + computerHand;
            user.setPotValue(user.getStackValue() - user.getBet());
            printUserChipBalance(user);
        } else if (userScore > 21 ){
            output = "\nYOU BUSTED!! Sorry about that.";
            user.setPotValue(user.getStackValue() - user.getBet());
            printUserChipBalance(user);
        } else if (userDiff > computerDiff && computerDiff >= 0) {
            output = ("\nYOU LOSE! I (Computer) scored " + computerScore + " with " + computerHand);
            user.setPotValue(user.getStackValue() - user.getBet());
            printUserChipBalance(user);
        } else if (userDiff < computerDiff) {
            output = ("\nYOU WIN!! I (Computer) score " + computerScore + " with " + computerHand);
            user.setPotValue(user.getStackValue() + (user.getBet() * 3));
            printUserChipBalance(user);
        } else if (computerScore > 21) {
            output = ("\nYOU WIN!! I (Computer) busted with " + computerHand);
            user.setPotValue(user.getStackValue() + (user.getBet() * 3));
            printUserChipBalance(user);
        }

        System.out.println(output);
    }

    private void printUserChipBalance(Player user) {
        System.out.println("You've currently got $" + user.getStackValue() + " worth of chips");
    }

    private int computerHand(Player user) {
        int currentScore = 0;
        for(Hand hand : user.getCards()) {
            currentScore += hand.getScoreValue();
        }
        return currentScore;
    }

    private int getScoreValue() {
        try {
            return Integer.valueOf(handValue);
        } catch (Exception e) {
            if (handValue.equalsIgnoreCase("ACE")) {
                return 11;
            } else {
                return 10;
            }
        }
    }
}
