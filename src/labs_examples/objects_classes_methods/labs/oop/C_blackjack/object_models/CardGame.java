package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;

public interface CardGame {

    public void deal(CardPlayer player, Deck deck);
    public void handleBets(CardPlayer player);
}
