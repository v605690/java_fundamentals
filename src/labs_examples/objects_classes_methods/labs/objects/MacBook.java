package labs_examples.objects_classes_methods.labs.objects;

public class MacBook {
    String M1;

    public MacBook(String m1, String CPU, String GPU, String memory, String SSD) {

        M1 = m1;
        this.CPU = CPU;
        this.GPU = GPU;
        Memory = memory;
        this.SSD = SSD;
    }

    String CPU;
    String GPU;
    String Memory;
    String SSD;

    public MacBook() {
        M1 = "Default hardware specs";
        CPU = "Default hardware specs";
        GPU = "Default hardware specs";

    }

    public MacBook(String m3, String CPU, String GPU) {
        M1 = m3;
        this.CPU = "14-Core";
        this.GPU = GPU;
        Memory = "Default memory";
        SSD = "Default SSD";
    }
}
