package labs_examples.objects_classes_methods.labs.objects.AirlineExample;

public class Accessible {
    private String travelers;
    private String disabled;
    private String seating;
    private String medical;

    public Accessible(String travelers, String disabled, String seating, String medical) {
        this.travelers = travelers;
        this.disabled = disabled;
        this.seating = seating;
        this.medical = medical;
    }

    public String getTravelers() {
        return travelers;
    }

    public void setTravelers(String travelers) {
        this.travelers = travelers;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    public String getMedical() {
        return medical;
    }

    public void setMedical(String medical) {
        this.medical = medical;
    }

    @Override
    public String toString() {
        return "Accessible{" +
                "travelers='" + travelers + '\'' +
                ", disabled='" + disabled + '\'' +
                ", seating='" + seating + '\'' +
                ", medical='" + medical + '\'' +
                '}';
    }
}
