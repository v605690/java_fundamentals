package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Energy extends TeslaVehicle {
    private String type;
    private int power;

    @Override
    public void supportGuides() {
        System.out.println("Support Guides On PowerWall3");
    }

    public Energy() {
        super("Model Y Info.", "Model Y Guides", "Model Y", "Electric",
                "Long Range", 311);
    }

    public Energy(String info, String guides, String model, String type, String battery, int range, String type1, int power) {
        super(info, guides, model, type, battery, range);
        this.type = type1;
        this.power = power;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Energy{" +
                "type='" + type + '\'' +
                ", power=" + power +
                ", info='" + info + '\'' +
                ", guides='" + guides + '\'' +
                '}';
    }
}
