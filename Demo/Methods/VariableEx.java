package Methods;

class variableExample {
    // global variable; takes up too much memory; avoid if you can
    static  double val = 123.45;

    public static void main(String[] args) {

        Person person = new Person("Pravin", 36);
        Person person2 = new Person("Lisa", 33);
        Person person3 = new Person("Jill", 42);

        System.out.println(person.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        double x = multiply(val, val * 2);
    }
    public static double multiply ( double a, double b){

        double result = a * b;
        printNum(result);
        return result;
    }
        public static void printNum ( double num){
            System.out.println(num);
            System.out.println(val);
    }
}
