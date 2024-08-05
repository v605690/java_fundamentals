package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        char c = 'p';
        System.out.println("Char c is: " + c);

        byte b = 125;
        System.out.println("byte b is: " + b);

        short s = 1000;
        System.out.println("short s is: " + s);

        long l = 6752426542642242l;
        System.out.println("long l is: " + l);

        float f = 3.14f;
        System.out.println("float f is: " + f);

        double d = 65445643453.675435354354;
        System.out.println("double d is: " + d);

        String str1 = "java";
        String str2 = "java";

        boolean strings = str1.equals(str2);

        System.out.println("boolean strings is: " + strings);

    }

}
