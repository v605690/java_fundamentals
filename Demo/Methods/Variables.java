package Methods;

public class Variables {

    static double val = 123.45;
    // psvm - need that to run the program
    public static void main(String[] args) {
        double x = multiply(val, val * 2);

        Person newPerson = new Person("Tom", 62);
        Person oldPerson = new Person("Lisa", 65);
        Person youngPerson = new Person("David", 23);

        System.out.println(newPerson);
        System.out.println(oldPerson);
        System.out.println(youngPerson);
    }

    public static int multiply(double a, double b) {
        double result = a * b;
        printNum(result);
        return (int) result;
    }

    public static void printNum(double numToPrint) {
        System.out.println(numToPrint);
    }

}
