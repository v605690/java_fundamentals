package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer:
 * Constructor Execution Order:
 * Superclass Constructor:
 * When you create an object of a subclass, the constructor of its superclass is called first.
 * Subclass Constructor:
 * After the superclass constructor completes, the constructor of the subclass is executed.
 * Method Execution Order:
 * Overridden Methods:
 * If a subclass overrides a method from its superclass, and you call that method on an object of the subclass,
 * the overridden version in the subclass is executed.
 * Inherited Methods:
 * If a subclass does not override a method from its superclass, and you call that method on an object of the subclass,
 * the method from the superclass is executed.
 *
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
