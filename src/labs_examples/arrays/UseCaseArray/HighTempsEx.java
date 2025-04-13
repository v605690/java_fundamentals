package labs_examples.arrays.UseCaseArray;

public class HighTempsEx {
    public static void main(String[] args) {

        int[] highTemps = new int[7];

        highTemps[0] = 65;
        highTemps[1] = 67;
        highTemps[2] = 70;
        highTemps[3] = 68;
        highTemps[4] = 71;
        highTemps[5] = 63;
        highTemps[6] = 63;

        int highest = highTemps[0];

        for (int i = 0; i < highTemps.length; i++) {
            if (highTemps[i] > highest) {
                highest = highTemps[i];
            }
        }
        System.out.println(highest);
    }
}


