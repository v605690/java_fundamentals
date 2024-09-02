package labs_examples.objects_classes_methods.labs.methods;

public class FindPrime {
    int num = 37;
    boolean isPrime = false;

    public FindPrime() {

        if (num == 0 || num == 1) {
            isPrime = true;
    }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
