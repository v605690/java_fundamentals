package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class SurfPolyMorph {

    Surfing surfboards;
    Surfing SurferDude1;
    Surfing SurferDude2;

    public SurfPolyMorph(Surfing surfboards) {
        this.surfboards = surfboards;
        this.SurferDude1 = SurferDude1;
        this.SurferDude2 = SurferDude2;

    }

    public void setSurfboards(Surfing surfboards) {
        this.surfboards = surfboards;
        this.SurferDude1 = SurferDude1;
        this.SurferDude2 = SurferDude2;
    }

    public void newbieSurfer() {
        surfboards.paddleOut();
        surfboards.masterPaddleOut();
        surfboards.paddleForWave();
        surfboards.stand();
        surfboards.rideWave();
        SurferDude1.rideWave();
        SurferDude2.rideWave();
    }
}
