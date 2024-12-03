package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Charging extends TeslaVehicle {
    private String charger = "Model Y Home Charger";

    public Charging() {
        super("Model Y Info.", "Model Y Guides", "Model Y", "Electric",
                "Long Range", 311);
    }

    public Charging(String info, String guides, String model, String type, String battery, int range, String charger) {
        super(info, guides, model, type, battery, range);
        this.charger = charger;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    @Override
    public String toString() {
        return "Charging{" +
                "charger='" + charger + '\'' +
                ", info='" + info + '\'' +
                ", guides='" + guides + '\'' +
                '}';
    }
}
