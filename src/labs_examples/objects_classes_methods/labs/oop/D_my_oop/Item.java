package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Item {

    private String name;
    private String category;
    private String weight;
    private double price;

    public Item(String name, String category, String weight, double price) {
        this.name = name;
        this.category = category;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("AAA Food Inventory: %s  %s ", name, weight + " ===>> " + String.format("low price $%1$,1.2f", price));
    }
}
