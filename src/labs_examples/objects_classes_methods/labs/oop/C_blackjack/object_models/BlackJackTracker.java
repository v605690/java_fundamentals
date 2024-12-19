package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;

public class BlackJackTracker {

    private int userGamesPlayed;
    private int computerGamesPlayed;

    public int BlackJackUserTracker() {
         userGamesPlayed = 0;
        return userGamesPlayed++;
    }

    public int BlackJackComputerTracker() {
        computerGamesPlayed = 0;
        return computerGamesPlayed++;
    }

    public int incrementUserGamesPlayed() {
       return userGamesPlayed;

    }

    public int incrementComputerGamesPlayed() {
        return computerGamesPlayed;
    }

    public BlackJackTracker() {
        this.userGamesPlayed = userGamesPlayed;
        this.computerGamesPlayed = computerGamesPlayed;
    }

    public int getUserGamesPlayed() {
        return userGamesPlayed;
    }

    public void setUserGamesPlayed(int userGamesPlayed) {
        this.userGamesPlayed = userGamesPlayed;
    }

    public int getComputerGamesPlayed() {
        return computerGamesPlayed;
    }

    public void setComputerGamesPlayed(int computerGamesPlayed) {
        this.computerGamesPlayed = computerGamesPlayed;
    }

    public int getTotalGamesPlayed() {
        return userGamesPlayed + computerGamesPlayed;
    }
}
