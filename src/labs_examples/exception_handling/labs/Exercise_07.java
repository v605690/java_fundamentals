package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
class Car {
    public static void checkGas(String word) throws CarContainGasException {
        if (word.contains("Tank Empty")) {
            throw new CarContainGasException("Car tank is empty");
        }
    }

    public static void main(String[] args) {
        try {
            checkGas("Tank Empty");
        } catch (CarContainGasException exc) {
            System.out.println("Caught Exception: " + exc.getMessage());
        }
    }
}

class CarContainGasException extends Exception {
    public CarContainGasException(String message) {
        super(message);
    }
}

