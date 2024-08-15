package labs_examples.lambdas.examples.functional_interfaces;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public interface InterfaceExample {

    default void printMessage(){
        System.out.println("Hey!");
    }

    int findPrimes(int a, int b);

}
