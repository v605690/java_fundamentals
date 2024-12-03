package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

class Surfboards implements Surfing {
    String surfer;

    public void surfboardShapes() {
        System.out.println("Generic surfboard shape");
    }

    public void Shortboard() {
        System.out.println("Going to use a shortboard to learn level one surfing");
    }

    @Override
    public void paddleOut() {
        System.out.println("Paddle Out");
    }

    @Override
    public void masterPaddleOut() {
        System.out.println("Master Paddle Out");
    }

    @Override
    public void paddleForWave() {
        System.out.println("Paddle For Wave");
    }

    @Override
    public void stand() {
        System.out.println("Stand On Board");
    }

    @Override
    public void rideWave() {
        System.out.println("Ride Wave");
    }

    public static void main(String[] args) {
        Surfboards surfboards = new Surfboards();
        Surfboards sb = new Surfboards();
        Surfboards shb = new Shortboard();
        Surfboards fhb = new Fishboard();
        Surfboards lb = new Longboard();
        Surfboards fnb = new Funboard();
        Surfboards gnb = new Gunboard();

        System.out.println("Most common type of Surfboards out there: ");
        surfboards.typeOfSurfBoards("Soft-top");
        surfboards.typeOfSurfBoards("Wooden");
        surfboards.typeOfSurfBoards("Polyurethane");
        surfboards.typeOfSurfBoards("Epoxy");

        System.out.println();

        System.out.println("Surfboards usually fall into five basic categories: ");
        shb.surfboardShapes();
        fhb.surfboardShapes();
        lb.surfboardShapes();
        fnb.surfboardShapes();
        gnb.surfboardShapes();
    }

    public void typeOfSurfBoards(String str) {
        System.out.println("Types of Surfboard: " + str);
    }
    public void typeOfSurfBoards(StringBuilder str2) {
        System.out.println("Types of Surfboard: " + str2);
    }
    public void typeOfSurfBoards(CharSequence str3) {
        System.out.println("Types of Surfboard: " + str3);

    }
}

class Shortboard extends Surfboards {
    @Override
    public void surfboardShapes() {
        System.out.println("Shortboard - ('5-7')");
    }
}

class Fishboard extends Surfboards {
    @Override
    public void surfboardShapes() {
        System.out.println("Fishboard - ('5-6'6)");
    }
}

class Longboard extends Surfboards {
    @Override
    public void surfboardShapes() {
        System.out.println("Longboard - (9+)");
    }
}

class Funboard extends Surfboards {
    @Override
    public void surfboardShapes() {
        System.out.println("Funboard - ('6.5'9')");
    }
}

class Gunboard extends Surfboards {
    @Override
    public void surfboardShapes() {
        System.out.println("Gun - ('7-11.5')");
    }
}

