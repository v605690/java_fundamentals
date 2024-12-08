package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.List;

// Polymorphism
public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }
    // TODO: Need to complete the method
    public void addItem(Item item) {
        this.items.add(item);
    }
    // TODO: Need to complete the method
    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void displayInventory() {
        for(Item item : items) {
            System.out.println(item);
        }
    }
}
