package labs_examples.objects_classes_methods.labs.methods;

public class OverLoadingEx {
    public int myadd(int a , int b) {
        return a + b;
    }
    public int myadd(int a, int b, int c) {
        return a + b + c;
    }
    public double myadd(double a, double b, double c) {
        return ((int)(a + b + c));
    }

}
