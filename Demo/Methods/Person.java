package Methods;

public class Person {

    String name;
    int age;
    static int numPersonCreated;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numPersonCreated++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numPersonCreated=" + numPersonCreated +
                '}';
    }
}
