package labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void displayInventory() {
        for(Item item : items) {
            System.out.println(item);
        }
    }
}
