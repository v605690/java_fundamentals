package labs_examples.packages.labs.lab_example1;

public class RockOut {
    public static void main(String[] args) {
        Rock rock[] = new Rock[1];

        rock[0] = new Rock("Rock", "1984", "Van Halen");
        for(int i=0; i < rock.length; i++) rock[i].group();
        System.out.println();
        rock[0].artist();
    }
}

// rock group is accessible since its part of same package where class resides,
// visible within same package by subclass


