package labs_examples.objects_classes_methods.labs.objects;

public class AppleMacBook {
    public static void main(String[] args) {

        MacBook mb = new MacBook("M1", "8-Core", "10-Core-GPU", "4GB", "256GB SSD");
        MacBook mb2 = new MacBook();
        MacBook mb3 = new MacBook("M3", "14-Core", "48-Core");

        String mb1;

        mb1 = "\n" + mb.M1 + "\n" + mb.CPU + "\n" + mb.GPU + "\n" + mb.Memory + "\n" +mb.SSD;
        System.out.println("Here are MacBook specs: " + mb1);

        System.out.println();

        mb1 = mb2.M1;
        System.out.println("M2 Macbook: " + "\n" + mb1);

        System.out.println();

        mb1 = "\n" + mb3.M1 + "\n" + mb3.CPU + "\n" + mb3.GPU + "\n" + mb3.Memory + "\n" +mb3.SSD;
        System.out.println("Here are the new MacBook Pro specs: " + mb1);

    }
}
