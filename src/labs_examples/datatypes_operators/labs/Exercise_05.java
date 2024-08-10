package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        if ((a == true && b) == false) {
            System.out.println("Above logical and will print");
        }

        if (a == false || b == false) {
            System.out.println("Logical or will print");
        }

        boolean b1 = !(b == true);
        if (!(b == true)) {
            System.out.println("This is true");
        }

        int x = 5;
        System.out.println(!(x > 3 && x < 10));
    }
}

