package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class Product {

    private ArrayList<Item> meats = new ArrayList<Item>();
    private ArrayList<Item> produce = new ArrayList<Item>();
    private ArrayList<Item> frozen = new ArrayList<Item>();
    private ArrayList<Item> dairy = new ArrayList<Item>();
    private ArrayList<Item> seafood = new ArrayList<Item>();

    private void populateItem() {
        meats.add(new Item("Ground Beef", "meats", "475lbs", 2000));
        meats.add(new Item("Beef Steak", "meats", "375lbs", 1125));
        meats.add(new Item("Beef Hamburger Patio", "meats", "275lbs", 1306.25));
        meats.add(new Item("Chicken Thighs", "meats", "100lbs", 275));
        meats.add(new Item("Chicken Breast", "meats", "255lbs", 701.25));
        meats.add(new Item("Boneless Chicken", "meats", "140lbs", 350));
        meats.add(new Item("Chicken Breast", "meats", "100lbs", 250));
        meats.add(new Item("Chicken Drum Sticks", "meats", "155lbs", 387.50));
        meats.add(new Item("Whole Chicken", "meats", "215lbs", 546.10));
        meats.add(new Item("Ground Turkey", "meats", "325lbs", 598));
        meats.add(new Item("Ground Turkey Patio", "meats", "115lbs", 201.25));
        meats.add(new Item("Whole Turkey", "meats", "95lbs", 336.30));
        meats.add(new Item("Bacon", "meats", "105lbs", 291.90));
        meats.add(new Item("Pork Chops", "meats", "15lbs", 490.75));
        meats.add(new Item("Pork Lion", "meats", "75lbs", 225));
        meats.add(new Item("Sausage", "meats", "75lbs", 150));
        meats.add(new Item("Hotdogs", "meats", "15lbs", 22.50));

        produce.add(new Item("Tomatoes", "Produce", "100lbs", 487));
        produce.add(new Item("Potatoes", "Produce", "100lbs", 487));
        produce.add(new Item("Squash", "Produce", "100lbs", 487));
        produce.add(new Item("Cucumber", "Produce", "100lbs", 487));
        produce.add(new Item("Onions", "Produce", "100lbs", 487));
        produce.add(new Item("Cauliflower", "Produce", "100lbs", 487));
        produce.add(new Item("Green Beans", "Produce", "100lbs", 487));
        produce.add(new Item("Broccoli", "Produce", "100lbs", 487));
        produce.add(new Item("Bell Pepper", "Produce", "100lbs", 487));
        produce.add(new Item("Parsley", "Produce", "100lbs", 487));
        produce.add(new Item("Basil", "Produce", "100lbs", 487));
        produce.add(new Item("Ginger", "Produce", "100lbs", 487));
        produce.add(new Item("Garlic", "Produce", "100lbs", 487));
        produce.add(new Item("Apple", "Produce", "100lbs", 487));
        produce.add(new Item("Pair", "Produce", "100lbs", 487));
        produce.add(new Item("Banana", "Produce", "100lbs", 487));
        produce.add(new Item("Grapes", "Produce", "100lbs", 487));
        produce.add(new Item("Strawberries", "Produce", "100lbs", 487));
        produce.add(new Item("Raspberries", "Produce", "100lbs", 487));
        produce.add(new Item("Blackberries", "Produce", "100lbs", 487));
        produce.add(new Item("Blueberries", "Produce", "100lbs", 487));
        produce.add(new Item("Peaches", "Produce", "100lbs", 487));
        produce.add(new Item("Plums", "Produce", "100lbs", 487));
        produce.add(new Item("Carrots", "Produce", "100lbs", 487));
        produce.add(new Item("Kiwi", "Produce", "100lbs", 487));
        produce.add(new Item("Sweet Potatoes", "Produce", "100lbs", 487));
        produce.add(new Item("Oranges", "Produce", "100lbs", 487));
        produce.add(new Item("Beets", "Produce", "100lbs", 487));

        frozen.add(new Item("Chicken Potstickers", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Tyson Chicken Strips", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Chicken Fajitas", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Chicken Bites", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Boneless Chicken", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("General Tso's Chicken", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Waffle Fries", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Ore-Ida Crispy Tater Tots", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Ore-Ida Crispy Fries", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Eggo Waffles", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Mozzarella Sticks", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Fish Sticks", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Jimmy Dean Sausages", "Frozen", "75lbs", 412.50));
        frozen.add(new Item("Frozen Pizza", "Frozen", "75lbs", 412.50));

        dairy.add(new Item("Silk Alomond Milk", "Dairy", "150lbs", 717));
        dairy.add(new Item("Greek Yogurt", "Dairy", "50lbs", 155.50));
        dairy.add(new Item("Half & Half", "Dairy", "15lbs", 31.80));
        dairy.add(new Item("Sour Cream", "Dairy", "15lbs", 36));
        dairy.add(new Item("Butter", "Dairy", "150lbs", 531));
        dairy.add(new Item("Cream Cheese", "Dairy", "15lbs", 18));
        dairy.add(new Item("Velveeta Cheese", "Dairy", "10lbs", 35.40));
        dairy.add(new Item("Cheese", "Dairy", "150lbs", 600));
        dairy.add(new Item("American Cheese", "Dairy", "150lbs", 525));
        dairy.add(new Item("Shredded Parmesan Cheese", "Dairy", "150lbs", 487.50));

        seafood.add(new Item("Catfish", "Seafood", "35lbs", 87.50));
        seafood.add(new Item("Red Snapper", "Seafood", "5lbs", 9));
        seafood.add(new Item("Sol Diver Fish", "Seafood", "15lbs", 22.50));
        seafood.add(new Item("Gulf Shrimp", "Seafood", "175bs", 481.25));
        seafood.add(new Item("Crab Cakes", "Seafood", "35bs", 128.80));
        seafood.add(new Item("Salmon", "Seafood", "100lbs", 480));
        seafood.add(new Item("Flounder", "Seafood", "30lbs", 67.20));
        seafood.add(new Item("Tilapia", "Seafood", "25lbs", 44.50));
        seafood.add(new Item("Cod", "Seafood", "60lbs", 226.80));
        seafood.add(new Item("Tuna", "Seafood", "40lbs", 190));
        seafood.add(new Item("Lobster", "Seafood", "75lbs", 311.25));
        seafood.add(new Item("Scallops", "Seafood", "35lbs", 96.25));
        seafood.add(new Item("Mahi Mahi", "Seafood", "130lbs", 491.30));
        seafood.add(new Item("Octopus", "Seafood", "35lbs", 52.50));
        seafood.add(new Item("Seabass", "Seafood", "35lbs", 49));
        seafood.add(new Item("Clams", "Seafood", "35lbs", 119));

    }

    public Product() {
        populateItem();
    }

    public Item getMeats(int index) {
        return meats.get(index);
    }

    public String getSize() {
        return "AAA Food Quantity List: " + "\nMeat Items " + meats.size() + "\nProduce Items " + produce.size() +
                "\nFrozen Items " + frozen.size() + "\nDairy Items " + dairy.size() + "\nSeafood Items " + seafood.size();

    }
    public String getAllMeats() {
        String MeatInventory = "";
        MeatInventory += "MEATS:\n";
        for(int i = 0; i < meats.size(); i++) {
            Item m = meats.get(i);
            MeatInventory += "M" + (i+1) + " " + m.toString() + "\n";

        }
        return MeatInventory;
    }

    public String getAllProduce() {
        String ProduceInventory = "";
        ProduceInventory += "PRODUCE:\n";
        for(int i = 0; i < produce.size(); i++) {
            Item p = produce.get(i);
            ProduceInventory += "P" + (i+1) + " " + p.toString() + "\n";

        }
        return ProduceInventory;
    }

    public String getAllFrozen() {
        String FrozenInventory = "";
        FrozenInventory += "FROZEN:\n";
        for(int i = 0; i < frozen.size(); i++) {
            Item f = frozen.get(i);
            FrozenInventory += "F" + (i+1) + " " + f.toString() + "\n";

        }
        return FrozenInventory;
    }

    public String getAllDairy() {
        String DairyInventory = "";
        DairyInventory += "DAIRY:\n";
        for(int i = 0; i < dairy.size(); i++) {
            Item d = dairy.get(i);
            DairyInventory += "D" + (i+1) + " " + d.toString() + "\n";

        }
        return DairyInventory;
    }

    public String getAllSeafood() {
        String SeafoodInventory = "";
        SeafoodInventory += "SEAFOOD:\n";
        for(int i = 0; i < seafood.size(); i++) {
            Item s = seafood.get(i);
            SeafoodInventory += "S" + (i+1) + " " + s.toString() + "\n";

        }
        return SeafoodInventory;
    }
    public String toString() {
        String product = "";
        product += "AAA Foods Distribution Inventory\n" +
        "---------------------------------------------------------------------------------------------\n";
        product += getAllMeats() + "\n";
        product += getAllProduce() + "\n";
        product += getAllFrozen() + "\n";
        product += getAllDairy() + "\n";
        product += getAllSeafood() + "\n";

        return product;
    }
}
