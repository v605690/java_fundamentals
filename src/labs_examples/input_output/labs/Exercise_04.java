package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

class Parse_CSV {
    public static void main(String[] args) {
        ArrayList<FoodInventory> foodInventories = new ArrayList();

        String filePath = "src/labs_examples/input_output/files/foodInventory.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                foodInventories.add(mapValuesToFoodInventoryObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (FoodInventory foodInventory : foodInventories) {
            System.out.println(foodInventory.toString());
        }
    }
    private static FoodInventory mapValuesToFoodInventoryObject(String[] values) {

        FoodInventory foodInventory = new FoodInventory();

        foodInventory.setFood(values[0]);
        foodInventory.setCategory(values[1]);
        foodInventory.setWeight(values[2]);
        foodInventory.setPrice(Double.parseDouble(values[3]));
        foodInventory.setDate(SimpleDateFormat.getDateInstance().format(new Date()));

        return foodInventory;
    }
}

class FoodInventory {
    private String food;
    private String category;
    private String weight;
    private double price;
    private String date;

    public FoodInventory() {
    }

    public FoodInventory(String food, String category, String weight, double price, String date) {
        this.food = food;
        this.category = category;
        this.weight = weight;
        this.price = price;
        this.date = date;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FoodInventory" + " " +
                "food='" + food + '\'' +
                ", category='" + category + '\'' +
                ", weight='" + weight + '\'' +
                ", price=" + price +
                ", date='" + date + '\'';
    }
}

