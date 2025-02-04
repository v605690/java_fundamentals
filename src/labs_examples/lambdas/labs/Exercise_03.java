package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

// Question 1
class CapitalizeUtils {
    public static void main(String[] args) {
        List<String> title = Arrays.asList("Hello", "To", "All", "The", "Fans", "Of\n ", "Harry Porter");
        title.forEach(CapitalizeUtils::upperCapitalize);
        System.out.println(upperCapitalize(title.stream().collect(Collectors.joining(" "))).toString());

        title.sort(String::compareToIgnoreCase);

    }

    public static String upperCapitalize(String str) {
        return str.toUpperCase();
    }
}

// Question 2

@FunctionalInterface
interface MyMonitor {
    Monitor get(String name);
}

class Monitor {
    private String name;
    public static void print(String message) {
        System.out.println(message);
    }

    public Monitor(String name) {
        this.name = name;
        System.out.println("43 Inch Monitor From " + name);
    }
}
// Question 2, 3
class MonitorController {
    public static void main(String[] args) {
        MyMonitor monitor = Monitor::new;
        monitor.get("LG");

        List<String> monitors = Arrays.asList("20 inch Monitor", "32 inch Monitor", "36 inch Monitor", "40 inch Monitor");

        monitors.forEach(Monitor::print);

    }
}
