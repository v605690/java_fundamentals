package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class TeslaController {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        Tesla vehicle = new TeslaVehicle("Model Y Info.", "Model Y Guides", "Model Y", "Electric",
        "Long Range", 311);
        Tesla energy = new Energy();
        Tesla charging = new Charging();
        Tesla bot = new TeslaBot("Tesla Bot Information", "Tesla Bot Guides", "Tesla Bot");

        tesla.defaultVideoGuides();
        tesla.defaultInsurance();
        tesla.supportGuides();

        vehicle.defaultVideoGuides();
        vehicle.defaultInsurance();

        energy.supportGuides();

        String chrg = charging.toString();

        System.out.println(chrg);

        String ts = bot.toString();

        System.out.println(vehicle);

        System.out.println(ts);

        System.out.println(vehicle.toString());
    }
}
