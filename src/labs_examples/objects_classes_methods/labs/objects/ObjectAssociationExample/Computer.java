package labs_examples.objects_classes_methods.labs.objects.ObjectAssociationExample;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.ram = new RAM();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.process();
        ram.load();
        hardDrive.readData();
        System.out.println("Computer started.");
    }
}
