package labs_examples.objects_classes_methods.labs.objects.AirlineExample;

public class Connectivity {
    String internet;
    String hvac;
    String lowVoltage;
    String seating;
    String pde;

    public Connectivity(String internet, String hvac, String lowVoltage, String seating, String pde) {
        this.internet = internet;
        this.hvac = hvac;
        this.lowVoltage = lowVoltage;
        this.seating = seating;
        this.pde = pde;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getHvac() {
        return hvac;
    }

    public void setHvac(String hvac) {
        this.hvac = hvac;
    }

    public String getLowVoltage() {
        return lowVoltage;
    }

    public void setLowVoltage(String lowVoltage) {
        this.lowVoltage = lowVoltage;
    }

    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    public String getPde() {
        return pde;
    }

    public void setPde(String pde) {
        this.pde = pde;
    }

    @Override
    public String toString() {
        return "Connectivity{" +
                "internet='" + internet + '\'' +
                ", hvac='" + hvac + '\'' +
                ", lowVoltage='" + lowVoltage + '\'' +
                ", seating='" + seating + '\'' +
                ", pde='" + pde + '\'' +
                '}';
    }
}
