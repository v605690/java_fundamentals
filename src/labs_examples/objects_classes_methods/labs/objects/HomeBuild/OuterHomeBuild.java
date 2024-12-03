package labs_examples.objects_classes_methods.labs.objects.HomeBuild;

public class OuterHomeBuild {

    private String siding;
    private String roof;
    private String window;
    private String ac_unit;
    private String story;

    public OuterHomeBuild(String siding, String roof, String window, String ac_unit, String story) {
        this.siding = siding;
        this.roof = roof;
        this.window = window;
        this.ac_unit = ac_unit;
        this.story = story;
    }

    public String getSiding() {
        return siding;
    }

    public void setSiding(String siding) {
        this.siding = siding;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getAc_unit() {
        return ac_unit;
    }

    public void setAc_unit(String ac_unit) {
        this.ac_unit = ac_unit;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return "OuterHomeBuild{" +
                "siding='" + siding + '\'' +
                ", roof='" + roof + '\'' +
                ", window='" + window + '\'' +
                ", ac_unit='" + ac_unit + '\'' +
                ", story='" + story + '\'' +
                '}';
    }
}
