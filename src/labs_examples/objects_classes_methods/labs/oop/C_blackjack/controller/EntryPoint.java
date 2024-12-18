package labs_examples.objects_classes_methods.labs.oop.C_blackjack.controller;

import java.util.Scanner;

public class EntryPoint {

    public static void main(String[] args) {
        // 3 create the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What game would you like to play?");
        System.out.println("Enter 1 for BlackJack, 2 for 5 Card Draw, 3 for ...");

        int userChoice = scanner.nextInt();

        // 4 invoke if / else flow statement
        if (userChoice == 1) {
            // 1 create blackJackGame
            BlackJackGame blackJackGame = new BlackJackGame();
            // 2 create blackJackGame.play() method
            blackJackGame.play();
        } else if (userChoice == 2) {
            // create an object of the 5 card draw poker game
            // play
        }
    }
}
