package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class TeslaVehicle extends Tesla {
    private String model;
    private String type;
    private String battery;
    private int range;

    @Override
    public void defaultVideoGuides() {
        System.out.println("Video Guides on Model Y");
    }

    @Override
    public void defaultInsurance() {
        System.out.println("Insurance on Model Y");
    }

//    public TeslaVehicle() {
//        super();
//    }

    public TeslaVehicle(String info, String guides, String model, String type, String battery, int range) {
        super(info, guides);
        this.model = model;
        this.type = type;
        this.battery = battery;
        this.range = range;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "TeslaVehicle{" +
                "range=" + range +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", battery='" + battery + '\'' +
                ", info='" + info + '\'' +
                ", guides='" + guides + '\'' +
                '}';
    }
}
