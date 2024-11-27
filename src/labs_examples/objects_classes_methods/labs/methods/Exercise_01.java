package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 4;
        int b = 2;

        String s = "To get to the other side...";

        int days = 365;
        int day = 24;
        int hour = 60;
        int minute = 60;
        int years = days * day * hour * minute;

        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        System.out.println();
        joke(s);
        System.out.println(" ");
        System.out.println("The number of seconds in a year: " + secondInYears(years));
        System.out.println(" ");

        int l =  varargs("scan Solaris nodes for ipv6", "complete labs methods exercise 1", "work on iOS project");
        System.out.println("Length is " + l);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(String s) {

        System.out.println("Why did the chicken cross the playground? " + s);
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int secondInYears(int years) {
        return years;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static int varargs(String... strings) {
        int length = 0;

        for (String s : strings) {
            length++;

            if (strings.length > 1)
                strings[1] = String.valueOf(length);
        }
        return length;
    }
}


