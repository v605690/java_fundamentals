package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class SurferDemo {
    public static void main(String[] args) {
        SurferDude1 kook = new SurferDude1();
        SurferDude2 kook2 = new SurferDude2();
        Surfboards sb = new Surfboards();

        sb.Shortboard();
        sb.typeOfSurfBoards("Epoxy");

        kook2.paddleOut();
        kook2.masterPaddleOut();
        kook2.stand();
        kook2.rideWave();
    }
}
