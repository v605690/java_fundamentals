package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: 10; inheritance deals with reference types not value types.  A subclass inherits the characteristics of its
 * superclass, when you create an object of a subclass, you're creating a reference to that object in memory.
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();
        A aa = new A();
        A b = new B();

        System.out.println(a.i);
        System.out.println(aa.i);
        System.out.println(b.i);

    }
}