package labs_examples.objects_classes_methods.labs.objects.HomeBuild;

public class InnerHomeBuild {

    private String flooring;
    private int rooms;
    private int bathrooms;
    private String kitchen;
    private String pantry;
    private String office;

    public InnerHomeBuild(String flooring, int rooms, int bathrooms, String kitchen, String pantry, String office) {
        this.flooring = flooring;
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.kitchen = kitchen;
        this.pantry = pantry;
        this.office = office;
    }

    public String getFlooring() {
        return flooring;
    }

    public void setFlooring(String flooring) {
        this.flooring = flooring;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getPantry() {
        return pantry;
    }

    public void setPantry(String pantry) {
        this.pantry = pantry;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "InnerHomeBuild{" +
                "flooring='" + flooring + '\'' +
                ", rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                ", kitchen='" + kitchen + '\'' +
                ", pantry='" + pantry + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}
