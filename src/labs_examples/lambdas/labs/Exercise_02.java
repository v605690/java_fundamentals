package labs_examples.lambdas.labs;

import java.util.Comparator;
import java.util.function.*;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */
class Controller1 {
    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Hello from a thread!");
        task.run();
        demoPredicate();
        demoConsumer();
        demoFunction();
        demoSupplier();
        demoBinaryOperator();
        demoBiConsumer();
        demoBiFunction();
        demoComparator();
        demoUnaryOperator();
    }

    private static void demoUnaryOperator() {
        UnaryOperator<Integer> increment = x -> x + 1;
        System.out.println(increment.apply(3));
    }

    private static void demoComparator() {
        Comparator<String> stringLengthComparator = (s1, s2) -> s1.length() - s2.length();
        System.out.println(stringLengthComparator.compare("Coding Is Kool", "Coding"));
    }

    private static void demoBiFunction() {
        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(5, 3));
    }

    private static void demoBiConsumer() {
        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println("Name: " + name + ", Age: " + age);
        printDetails.accept("Pravin", 56);
    }

    private static void demoBinaryOperator() {
        BinaryOperator<Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(5, 3));
    }

    private static void demoSupplier() {
        Supplier<Double> getRandom = () -> Math.random();
        System.out.println(getRandom.get());
    }

    private static void demoFunction() {
        Function<Integer, String> convertToString = num -> Integer.toString(num);
        System.out.println(convertToString.apply(22));
    }

    private static void demoConsumer() {
        Consumer<? super String> printMessage = msg -> System.out.println(msg);
        printMessage.accept("CodingNomads is a kool place to learn coding");
    }

    private static void demoPredicate() {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(2));
    }
}



