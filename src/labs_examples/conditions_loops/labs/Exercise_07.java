package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {
    public static void main(String[] args) {
        int count = 0;
        String str = "Java fundamentals";

        while (count < str.length()) {
            int i = count++;
            char ch = str.charAt(i);

            if ("AEIOUaeiou".indexOf(ch) >= 0) {
                System.out.println("The string is: " + str + " " + ch);
            }
        }
    }
}

//            if (ch == 'a' || ch == 'A'
//                    || ch == 'e' || ch == 'E'
//                    || ch == 'i' || ch == 'I'
//                    || ch == 'o' || ch == 'O'
//                    || ch == 'u' || ch == 'U'
//            ) {


