package labs_examples.objects_classes_methods.labs.objects.AirlineExample;

public class AirlineDemo {
    public static void main(String[] args) {

        Performance Airliner = new Performance(560, "Two General Electric GEnx Engines", "197 Feet", 800.90);
        Connectivity connectivity = new Connectivity("Wi-Fi", "Power outlets", "USB ports", "seatback entertainment", "Personal device entertainment");
        Comfort comfort = new Comfort("United Polaris business class", "United Premium Plus", "United Economy Plus", "United Economy");
        Accessible accessible = new Accessible("Senior travelers", "Wheelchairs and mobility services", "Accessible seating", "Meds and medical equipment");

        System.out.println("United Airlines newest airliner that features " + Airliner.getPropulsion() + ", a wing span of " + Airliner.getWingSpan() + " with a fuel capacity of " + Airliner.getFuelCapacity() + " gallons of fuel." + " The " +
                "dreamliner 787-10 has slue of connection points " + connectivity.getInternet() + " with " + connectivity.getHvac() + ", " + connectivity.getLowVoltage() + " and our best feature " + connectivity.getSeating() + "." + " \n We have the best in" +
               " comfort seating from " + comfort.getClassA() + " to " + comfort.getClassD() + ". "  + " The airliner makes every effort to have the best in accessibility, from " + accessible.getDisabled() + " to " + accessible.getMedical() + "."

        );
    }
}
