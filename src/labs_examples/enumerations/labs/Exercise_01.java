package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */
class Tesla {
    enum teslaModel {
        MODELS("MODEL S", "Electric Car"),
        MODELY("MODEL Y", "Electric Cross Over SUV"),
        MODEL3("MODEL 3", "Electric Car"),
        MODELX("MODEL X", "Electric SUV");

        private final String model;
        private final String description;

        teslaModel(String model, String description) {
            this.model = model;
            this.description = description;
        }

        public String getModel() {
            return model;
        }

        public String getDescription() {
            return description;
        }
    }
}
class Controller {
    private Tesla car;

    public Controller(Tesla car) {
        this.car = car;
    }

    public Tesla getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "car=" + car +
                '}';
    }

    public static void main(String[] args) {
        final var model3 = Tesla.teslaModel.MODEL3.getModel() + " " + Tesla.teslaModel.MODEL3.getDescription();
        System.out.println("I drive a " + model3);
    }
}

class Location {
    public enum Direction {
        NORTH("North"),
        SOUTH("South"),
        EAST("East"),
        WEST("West");

        private final String name;

        Direction(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

class Controller2 {
    private static Integer value = 90;

    Controller2(Integer value) {
        Controller2.value = 90;
    }

    public Integer getValue() {
        return value;
    }

    public static void main(String[] args) {
        Location.Direction east = Location.Direction.EAST;


        System.out.println("I am going in the direction of " + east.getName() + " Which is " + value.intValue() + " degrees");
    }
}