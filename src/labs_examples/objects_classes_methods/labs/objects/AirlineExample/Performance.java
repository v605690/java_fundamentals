package labs_examples.objects_classes_methods.labs.objects.AirlineExample;

public class Performance {
    int speed;
    private String propulsion;
    private String wingSpan;
    private Double fuelCapacity;

    public Performance(int speed, String propulsion, String wingSpan, Double fuelCapacity) {
        this.speed = speed;
        this.propulsion = propulsion;
        this.wingSpan = wingSpan;
        this.fuelCapacity = fuelCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public String getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }

    public Double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "speed=" + speed +
                ", propulsion='" + propulsion + '\'' +
                ", wingSpan='" + wingSpan + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}
