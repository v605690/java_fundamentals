package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class CustomGeneric<T, U> {
    T obj1;
    U obj2;

    public CustomGeneric(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }
}

class GenController {
    public static void main(String[] args) {
        CustomGeneric <String, Integer> obj1 = new CustomGeneric<String, Integer>("Sunny Skies today, but freezing at ", 19 );
        System.out.println(obj1.getObj1() + obj1.getObj2());
        CustomGeneric<String, Integer> obj2 = new CustomGeneric<String, Integer>("Error Code ", 404);
        System.out.println(obj2.getObj1() + obj2.getObj2());
        CustomGeneric <Integer, Integer> obj3 = new CustomGeneric<Integer, Integer>(88, 55);
        System.out.println("The sum is " + (obj3.getObj1() + obj3.getObj2()));

    }
}
