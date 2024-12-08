package labs_examples.objects_classes_methods.labs.oop.D_my_oop;
// Inheritance
public class PerishableItem extends Item {
    private String expirationDate;

    public PerishableItem(String name, String category, String weight, double price, String expirationDate) {
        super(name, category, weight, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return String.format("AAA Food Inventory: %s  %s ", getName(), getWeight() + " ===>>> " + String.format("low price $%1$,1.2f", getPrice()) +" " + String.format("Expiration Date: %s ", expirationDate));
    }
}
