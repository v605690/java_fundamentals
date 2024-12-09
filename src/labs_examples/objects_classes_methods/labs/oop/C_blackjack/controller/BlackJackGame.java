package labs_examples.objects_classes_methods.labs.oop.C_blackjack.controller;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models.*;

import java.util.Random;
import java.util.Scanner;

public class BlackJackGame extends Game implements CardGame {
    public void play() {

        setName("BlackJack");
        setBasicRules("The player closest to 21 without going over wins");

        CardPlayer computer = new CardPlayer("Computer", 10000);
        CardPlayer user = new CardPlayer();

        Deck deck;
        int count = 0;

        do {
            deck = new Deck();

            System.out.println("\nGame #" + Deck.getFreshDecksLoaded());

            handleBets(user);

            dealInitialCards(user, computer, deck);
            count++;

        while (true) {
            if(checkforHit(user)) {
                deal(user, deck);
                } else {
                break;
                }
            }
            while (true) {
                if(checkforHit(computer)) {
                    deal(computer, deck);
                } else {
                    break;
                }
            }

            scoreHands(user, computer);

        } while (count < 1);
    }

    private void scoreHands(CardPlayer user, CardPlayer computer) {

        int computerScore = analyzeHand(computer);
        int userScore = analyzeHand(user);

        int computerDiff = 21 - computerScore;
        int userDiff = 21 - userScore;

        String computerHand = computer.getHand().toString();
        String output = "";

        if (computerScore == 21 && userScore == 21) {
            output = "\nYOU TIED!! I (Computer) scored " + computerScore + " with " + computerHand;
            user.setStackValue(user.getStackValue() - (user.getBet() / 2));
            printUserChipBalance(user);
        } else if (computerScore == 21) {
            output = "\nYOU LOSE!! I (Computer) landed 21 with " + computerHand;
            user.setStackValue(user.getStackValue() - user.getBet());
            printUserChipBalance(user);
        } else if (userScore > 21) {
            output = "\nYOU BUSTED!! Sorry about that.";
            user.setStackValue(user.getStackValue() - user.getBet());
            printUserChipBalance(user);
        } else if (userDiff > computerDiff && computerDiff >= 0) {
            output = ("\nYOU LOSE! I (Computer) scored " + computerScore + " with " + computerHand);
            user.setStackValue(user.getStackValue() - user.getBet());
            printUserChipBalance(user);
        } else if (userDiff < computerDiff) {
            output = ("\nYOU WIN!! I (Computer) score " + computerScore + " with " + computerHand);
            user.setStackValue(user.getStackValue() + (user.getBet() * 3));
            printUserChipBalance(user);
        } else if (computerScore > 21) {
            output = ("\nYOU WIN!! I (Computer) busted with " + computerHand);
            user.setStackValue(user.getStackValue() + (user.getBet() * 3));
            printUserChipBalance(user);
        }

        System.out.println(output);
        writeOutputToFile(output);
    }

    private void writeOutputToFile(String output) {

    }

    private void printUserChipBalance(CardPlayer user) {
        System.out.println("You've currently got $" + user.getStackValue() + " worth of chips");
    }

    private boolean checkforHit(CardPlayer user) {

        Scanner scanner = new Scanner(System.in);
        int currentScore = analyzeHand(user);

        if(!user.getName().equalsIgnoreCase("computer")) {
            System.out.println("\n ** The current score of your hand is " + currentScore + "**");
            System.out.println("\n Would you like another card? Press \'y\' for YES and \'n\' for NO");

            String response = scanner.next();

            if (response.equalsIgnoreCase("y")) {
                return true;
            } else {
                return false;
            }
        } else {
            if (currentScore <= 16) {
                return true;
            } else {
                return false;
            }
        }
    }
    private int analyzeHand(CardPlayer user) {
        int currentScore = 0;
        for(Card c : user.getHand()) {
            currentScore += c.getScoreValue();
        }
        return currentScore;
    }

    private void dealInitialCards(CardPlayer user, CardPlayer computer, Deck deck) {
        deal(user, deck);
        deal(computer, deck);
        deal(user, deck);
        deal(computer, deck);

        System.out.println("\n ---------------------------------------------");
        System.out.println("Your first card is: " + user.getHand().get(0).customToString());
        System.out.println("Your second card is: " + user.getHand().get(1).customToString());
        System.out.println("---------------------------------------------");
        System.out.println("My (computer) first card is: " + user.getHand().get(0).customToString());
        System.out.println("My (computer) second card is: FACE DOWN!");
        System.out.println("---------------------------------------------");

    }

    @Override
    public void deal(CardPlayer player, Deck deck) {
        int randomNum = getRandomCard(deck);
        Card card = deck.getCardAt(randomNum);
        player.getHand().add(card);
    }

    private int getRandomCard(Deck deck) {
        Random random = new Random();

        int n = random.nextInt(51) + 0;

        while(deck.isCardUsed(n)) {
            n = random.nextInt(51) + 0;
        }
        deck.getUsedCards().add(n);
        return n;
    }

    @Override
    public void handleBets(CardPlayer player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow much would you like to bet on this game?");
        System.out.println("You're currently holding $" + player.getStackValue() + " worth of chips");

        int bet = scanner.nextInt();

        if(bet <= player.getStackValue()) {
            if(bet == player.getStackValue()) {
                System.out.println("Goin' \"all in\", eh?");
            }
            player.setBet(bet);

        } else {

            do {
                System.out.println("\nSorry pal, you can't bet more than you got! Please bet something less " +
                        "than $" + player.getStackValue());
                System.out.println("\nHow much would you like to bet?");
                bet = scanner.nextInt();
            } while (bet > player.getStackValue());

            player.setBet(bet);
        }
    }
}
