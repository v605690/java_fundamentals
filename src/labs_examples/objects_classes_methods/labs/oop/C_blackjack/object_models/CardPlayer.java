package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;

import java.util.ArrayList;
import java.util.Scanner;

public class CardPlayer {
    private String name;
    private int stackValue;
    // Below is required to track bets and hand during step 13
    private int bet;
    private ArrayList<Card> hand = new ArrayList();

    //  6 overload the method with a new custom constructor
    // Overloading
    // Creating two or more constructors, or methods, with the same name and return
    public CardPlayer() {
        initializeNewUser();
    }

    // Create 1st constructor
    public CardPlayer(String name, int stackValue) {
        this.name = name;
        this.stackValue = stackValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStackValue() {
        return stackValue;
    }

    public void setStackValue(int stackValue) {
        this.stackValue = stackValue;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    private void initializeNewUser() {
        // 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, and welcome to BlackJack! My name is Computer, what is your name?");
        this.name = scanner.next();

        System.out.println("Thanks, " + this.name + "! How much money would you like to start with?");
        this.stackValue = scanner.nextInt();
    }

}
