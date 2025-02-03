package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */
// Question 1 & 2
@FunctionalInterface
public interface Exercise_01 {
    void execute();
}

class Message {
    public static void main(String[] args) {
Exercise_01 message = () -> System.out.println("First Background Check Approved");
message.execute();

    Exercise_01 anonymousMessage = new Exercise_01() {
        @Override
        public void execute() {
            System.out.println("Secondary Background Check Approved");
        }
    };
    anonymousMessage.execute();
    }
}
// Question 3 & 4
@FunctionalInterface
interface CustomFunction<T> {
    T apply(T t);
}

class Controller {
    public static void main(String[] args) {
        CustomFunction<Integer> increment = x -> x + 1;

        int originalValue = 5;
        int result = increment.apply(originalValue);
        System.out.println(originalValue);
        System.out.println(result);

        CustomFunction<Integer> anonymousOutput = new CustomFunction<>() {

            @Override
            public Integer apply(Integer t) {

                return t + 1;
            }
        };
        System.out.println(anonymousOutput.apply(1));
    }
}

// Question 5 & 6
@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}

class Controller2{
    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y;
        int result = add.calculate(4, 2);
        System.out.println(result);

        Calculator add2 = new Calculator() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int result2 = add2.calculate(4, 2);
        System.out.println(result2);
    }
}

// Question 7
@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}

class PredicateDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lisa", "Toby", "Jennifer", "John");

        Predicate<String> name = x -> Objects.equals(x, "Lisa");

        for (String str : names) {
            if (name.test(str)) {
                System.out.println(str);
            }
        }
    }
}

@FunctionalInterface
interface BinaryOperator<T> {
    T apply(T x, T y);
}

class Controller3 {
    public static void main(String[] args) {
        BinaryOperator<Integer> adder = (x, y) -> x + y;
        int result = adder.apply(20, 15);
        System.out.println(result);
    }
}





