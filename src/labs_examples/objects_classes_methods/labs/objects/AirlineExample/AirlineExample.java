package labs_examples.objects_classes_methods.labs.objects.AirlineExample;

public class AirlineExample {

    Performance performance;
    Connectivity connectivity;
    Comfort comfort;
    Accessible accessible;

    public AirlineExample(Performance performance, Connectivity connectivity, Comfort comfort, Accessible accessible) {
        this.performance = performance;
        this.connectivity = connectivity;
        this.comfort = comfort;
        this.accessible = accessible;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public Connectivity getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(Connectivity connectivity) {
        this.connectivity = connectivity;
    }

    public Comfort getComfort() {
        return comfort;
    }

    public void setComfort(Comfort comfort) {
        this.comfort = comfort;
    }

    public Accessible getAccessible() {
        return accessible;
    }

    public void setAccessible(Accessible accessible) {
        this.accessible = accessible;
    }

    @Override
    public String toString() {
        return "AirlineExample{" +
                "performance=" + performance +
                ", connectivity=" + connectivity +
                ", comfort=" + comfort +
                ", accessible=" + accessible +
                '}';
    }
}
