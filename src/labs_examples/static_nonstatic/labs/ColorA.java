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

public class ColorA {
    public static void main(String[] args) {
        red();
        ColorA obj = new ColorA();
        obj.blue();
        ColorB.green();
        ColorB obj2 = new ColorB();
        obj2.yellow();
        ColorA obj3 = new ColorA();
        obj3.mixedColor();
        ColorB obj4 = new ColorB();
        obj4.brwblk();
        ColorA obj5 = new ColorA();
        obj5.mixedColor2();
        ColorB.bluyell();
        ColorB obj6 = new ColorB();
        obj6.mixColor3();
        ColorA obj7 = new ColorA();
        obj7.mixedColor3();
    }

    public static void red() {
        System.out.println("Primary Static Red Color");
    }

    public void blue() {
        System.out.println("Primary Non-Static Blue Color");
    }

    public void mixedColor() {
        orgpur();
    }

    public void orgpur() {
        System.out.println("Orange mixed Purple = Shade Of Brown");
    }

    public static void rdgrn() {
        System.out.println("Red mixed Green = Brown");
    }

    public void mixedColor2() {
        rdgrn();
    }

    public void mixedColor3() {
        yelRed();
    }

    public static void yelRed() {
        System.out.println("Yellow mixed Red = Orange");
    }
}




