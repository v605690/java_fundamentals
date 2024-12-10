package labs_examples.static_nonstatic.labs;

/*
1) A static method calling another static method in the same class
2) A static method calling a non-static method in the same class
3) A static method calling a static method in another class
4) A static method calling a non-static method in another class
5) A non-static method calling a non-static method in the same class
6) A non-static method calling a non-static method in another class
7) A non-static method calling a static method in the same class
8) A non-static method calling a static method in another class
 */

public class ColorB {

    public static void green() {
        System.out.println("Primary Green Color from secondary class");
    }

    public void yellow() {
        System.out.println("Primary non-static Yellow Color from secondary class");
    }

    public void newColor() {
        brwblk();
    }

    public void brwblk() {
        System.out.println("Brown mixed Black = Dark Brown");
    }

    public static void bluyell() {
        System.out.println("Blue mixed Yellow = Green");
    }

    public void mixColor3() {
        bluyell();
    }
}
