package CSE_214_SWE_Sessional.Previous_Onlines;

class HolidayPackage{
    String flight;
    String hotel;
    String dailyActivity;

    public HolidayPackage(){
        flight = "N/A";
        hotel= "N/A";
        dailyActivity = "N/A";
    }

    public void print(){
        System.out.println(flight);
        System.out.println(hotel);
        System.out.println(dailyActivity);
    }
}

interface PackageBuilder{
    PackageBuilder setFlight();
    PackageBuilder setHotel();
    PackageBuilder setDA();
    HolidayPackage build();
}

class RelaxationPackageBuilder implements PackageBuilder{
    HolidayPackage hp;

    public RelaxationPackageBuilder(){
        hp = new HolidayPackage();
    }

    @Override
    public HolidayPackage build() {
        return hp;
    }

    @Override
    public PackageBuilder setDA() {
        hp.dailyActivity = "Spa";
        return this;
    }

    @Override
    public PackageBuilder setFlight() {
        hp.flight = "Business Class";
        return this;
    }

    @Override
    public PackageBuilder setHotel() {
        hp.hotel = "5 Star";
        return this;
    }
    
}

class AdventurePackageBuilder implements PackageBuilder{
    HolidayPackage hp;

    public AdventurePackageBuilder(){
        hp = new HolidayPackage();
    }

    @Override
    public HolidayPackage build() {
        return hp;
    }

    @Override
    public PackageBuilder setDA() {
        hp.dailyActivity = "Hiking Tour";
        return this;
    }

    @Override
    public PackageBuilder setFlight() {
        hp.flight = "Economic";
        return this;
    }

    @Override
    public PackageBuilder setHotel() {
        hp.hotel = "Mountain Cabin";
        return this;
    }
    
}

public class a2_2022_creational {
    public static void main(String[] args) {
        PackageBuilder builder = new AdventurePackageBuilder();

        HolidayPackage holidayPackage = builder.setFlight().setHotel().setDA().build();

        holidayPackage.print();
    }
}
