package labs_examples.objects_classes_methods.labs.objects.AirlineExample;

public class Comfort {
    String classA;
    String classB;
    String classC;
    String classD;

    public Comfort(String classA, String classB, String classC, String classD) {
        this.classA = classA;
        this.classB = classB;
        this.classC = classC;
        this.classD = classD;
    }

    public String getClassA() {
        return classA;
    }

    public void setClassA(String classA) {
        this.classA = classA;
    }

    public String getClassB() {
        return classB;
    }

    public void setClassB(String classB) {
        this.classB = classB;
    }

    public String getClassC() {
        return classC;
    }

    public void setClassC(String classC) {
        this.classC = classC;
    }

    public String getClassD() {
        return classD;
    }

    public void setClassD(String classD) {
        this.classD = classD;
    }

    @Override
    public String toString() {
        return "Comfort{" +
                "classA='" + classA + '\'' +
                ", classB='" + classB + '\'' +
                ", classC='" + classC + '\'' +
                ", classD='" + classD + '\'' +
                '}';
    }
}
