package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below

        String letters1 = "abcdefghijk";
        String letters2 = "abcdefghijk";

        if (letters1 == letters2) {
            System.out.println("strings are equal");
        }

        if (b > a) {
            System.out.println("b is greater than b");
        }

        int x = 33;
        int y = 55;

        if (x <= y) {
            System.out.println("x is less than equal to y");
        }

        if (b >= a) {
            System.out.println("b is great than equal to a");
        }
    }
}

