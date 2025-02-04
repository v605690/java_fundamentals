package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demonstrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Example {
    public static void main(String[] args) {
        rangeFunction();
        sumFunction();
        mapFunction();
        filterFunction();
        reduceFunction();
        streamTextFileFunction();
        streamCSVFileFunction();
        streamCSVFileFunction2();
        anyMatchFunction();
        allMatchFunction();
        collectFunction();
    }

    private static void rangeFunction() {
        IntStream.range(1, 15 +1).forEach(System.out::println);
        System.out.println();
    }

    private static void sumFunction() {
        System.out.println(IntStream.range(1, 20 +1).sum());
        System.out.println();
    }

    private static void mapFunction() {
        Arrays.stream(new int[] {5, 10, 15, 20, 25}).map(x -> x + x).average().ifPresent(System.out::println);
        System.out.println();
    }

    private static void filterFunction() {
        List<String> plants = Arrays.asList("Cactus", "Rose", "Columbine", "Camellia", "Jade Plant");
        plants.stream().map(String::toLowerCase).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println();
    }

    private static void reduceFunction() {
        int total = Stream.of(12, 6, 11, 13).reduce(0, Integer::sum);
        System.out.println("Total = " + total);
    }

    private static void streamTextFileFunction() {
    }

    private static void streamCSVFileFunction() {
    }

    private static void streamCSVFileFunction2() {
    }

    private static void anyMatchFunction() {
    }

    private static void allMatchFunction() {
    }

    private static void collectFunction() {
    }
}
