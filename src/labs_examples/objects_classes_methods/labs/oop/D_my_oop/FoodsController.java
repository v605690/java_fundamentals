package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack.object_models.Inventory;

public class FoodsController {
    public static void main(String[] args) {
        Product product = new Product();
        String size = product.getSize();
        System.out.println(size);
        System.out.println();
        Item foodItem = product.getMeats(15);
        System.out.println(foodItem);
        System.out.println();
        System.out.println(product.toString());

        Inventory inventory = new Inventory();
        inventory.addItem(new Item("Hotdogs", "meats", "15lbs", 22.50));
        inventory.addItem(new PerishableItem("Silk Alomond Milk", "Dairy", "150lbs", 717,"2024-12-31"));
        inventory.displayInventory();

    }
}
