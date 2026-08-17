package Prev_Year;

class Bicycle {

    String frame;
    String gear;
    String tireType;

    public void print() {
        System.out.println("Frame: " + frame);
        System.out.println("Gear System: " + gear);
        System.out.println("Tire Type: " + tireType);
    }
}


// Builder
class BicycleBuilder {

    private Bicycle bicycle;

    public BicycleBuilder() {
        bicycle = new Bicycle();
    }

    public BicycleBuilder buildFrame(String frame) {
        bicycle.frame = frame;
        return this;
    }

    public BicycleBuilder addGear(String gear) {
        bicycle.gear = gear;
        return this;
    }

    public BicycleBuilder addTires(String tireType) {
        bicycle.tireType = tireType;
        return this;
    }

    public Bicycle build() {
        return bicycle;
    }
}


// Director
class BicycleDirector {

    public Bicycle createCommuter() {

        BicycleBuilder builder = new BicycleBuilder();

        return builder
                .buildFrame("Aluminum Frame")
                .addGear("Single Speed Gear")
                .addTires("Road Tires")
                .build();
    }

    public Bicycle createMountainBeast() {

        BicycleBuilder builder = new BicycleBuilder();

        return builder
                .buildFrame("Carbon Fiber Frame")
                .addGear("12-Speed Gear")
                .addTires("Off-road Grip Tires")
                .build();
    }
}


// Client
public class c1 {

    public static void main(String[] args) {

        BicycleDirector director = new BicycleDirector();

        Bicycle commuter = director.createCommuter();

        System.out.println("Commuter Bicycle:");
        commuter.print();

        System.out.println();

        Bicycle mountainBeast = director.createMountainBeast();

        System.out.println("Mountain Beast Bicycle:");
        mountainBeast.print();
    }
}