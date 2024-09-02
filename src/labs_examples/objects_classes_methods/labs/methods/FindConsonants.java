package labs_examples.objects_classes_methods.labs.methods;

public class FindConsonants {
    public static int ConsonantsMethod() {

        int vowelCount = 0;
        int consonantsCount = 0;

        String str = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                consonantsCount++;
            }
        }
        return consonantsCount;
    }
}