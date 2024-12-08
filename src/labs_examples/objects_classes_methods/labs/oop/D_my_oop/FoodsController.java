package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class FoodsController {
    public static void main(String[] args) {
        Product product = new Product();
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        inventory.addItem(new Item("Hotdogs", "meats", "15lbs", 22.50));
        inventory.addItem(new PerishableItem("Silk Alomond Milk", "Dairy", "150lbs", 717,"2024-12-31"));
        inventory.addItem(new PerishableItem("Butter", "Dairy", "150lbs", 531, "2024-12-31"));
        inventory.addItem(new PerishableItem("Silk Alomond Milk", "Dairy", "150lbs", 717,"2024-12-31"));
        inventory.addItem(new PerishableItem("Half & Half", "Dairy", "15lbs", 31.80,"2024-12-31"));
        inventory.addItem(new PerishableItem("Catfish", "Seafood", "35lbs", 87.50,"2024-12-31"));
        inventory.addItem(new PerishableItem("Sour Cream", "Dairy", "15lbs", 36,"2024-12-31"));
        inventory.addItem(new PerishableItem("Cream Cheese", "Dairy", "15lbs", 18,"2024-12-31"));
        inventory.addItem(new PerishableItem("Cheese", "Dairy", "150lbs", 600,"2024-12-31"));
        inventory.addItem(new PerishableItem("Blackberries", "Produce", "100lbs", 487,"2024-12-31"));

        while (true) {
            System.out.println();
            System.out.println("1 Add Item");
            System.out.println("2 Display Current Inventory");
            System.out.println("3 Display Product List");
            System.out.println("4 Display Quantity");
            System.out.println("5 Exit");
            System.out.println();

            int item = scanner.nextInt();
            scanner.nextLine();

            switch (item) {
                case 1:
                    Item Item = null;
                    inventory.addItem(Item);
                    break;
                case 2:
                    inventory.displayInventory();
                    break;
                case 3:
                    System.out.println(product.toString());
                    break;
                case 4:
                    System.out.println(product.getSize());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
