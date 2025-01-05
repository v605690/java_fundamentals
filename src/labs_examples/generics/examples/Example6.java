package labs_examples.generics.examples;

class A {
    public A(Integer resourceA, Integer resourceB) {
    }

    public A() {

    }
    // ...
}

class B extends A {
    public B(Integer resourceA, Integer resourceB) {
        super(resourceA, resourceB);
    }

    public B() {

    }
    // ...
}

class C extends A {
    public C(Integer resourceA, Integer resourceB) {
        super(resourceA, resourceB);
    }

    public C() {

    }
    // ...
}

// Note that D does NOT extend A.
class D {
    // ...
}