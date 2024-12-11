package labs_examples.packages.labs.lab_example1;

import labs_examples.packages.labs.lab_example2.Alternative;

public class JamOut {
    public static void main(String[] args) {
        Alternative[] alternative = new Alternative[1];

        alternative[0] = new  Alternative("Alternative", "One More Time... Part-2", "Blink-182");
        // for(int i=0; i < alternative.length; i++) alternative[i].group();
        alternative[0].artist();

    }
}

// Cannot print the contents of alternative group since it's protected and not part of the same class
