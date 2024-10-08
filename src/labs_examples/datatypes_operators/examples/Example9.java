package labs_examples.datatypes_operators.examples;

// Demonstrate lifetime of a variable.
class VarInitDemo {
    public static void main(String[] args) {
        int x;

        for(x = 0; x < 3; x++) {
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is: " + y); // this always prints -1
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}

class ForLoop {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 1; x++) {
            int m = 0;
            System.out.println("m is: " + m);
            m  = 50;
            System.out.println("m is now: " + m);
        }
    }
}