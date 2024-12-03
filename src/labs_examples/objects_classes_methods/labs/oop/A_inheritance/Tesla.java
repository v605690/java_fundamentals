package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Tesla {

    String info;
    String guides;

    public void defaultVideoGuides() {
        System.out.println("Default Video Guides");
    }

    public void defaultInsurance() {
        System.out.println("Default Insurance on products");
    }

    public void supportGuides() {
        System.out.println("General Support Guides");
    }

    public Tesla() {
        super();
    }

    public Tesla(String info, String guides) {
        this.info = info;
        this.guides = guides;

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getGuides() {
        return guides;
    }

    public void setGuides(String guides) {
        this.guides = guides;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "info='" + info + '\'' +
                ", guides='" + guides + '\'' +
                '}';
    }
}
