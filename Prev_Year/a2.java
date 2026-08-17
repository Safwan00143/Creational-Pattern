package Prev_Year;
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

class PackageBuilder{
    private HolidayPackage holidayPackage;

    public PackageBuilder(){
        holidayPackage= new HolidayPackage();
    }

    public PackageBuilder setFlight(String flight){
        holidayPackage.flight = flight;
        return this;
    }

    public PackageBuilder setHotel(String hotel){
        holidayPackage.hotel = hotel;
        return this;
    }

    public PackageBuilder setDailyActivity(String dailyActivity){
        holidayPackage.dailyActivity = dailyActivity;
        return this;
    }

    public HolidayPackage build(){
        return holidayPackage;
    }
}

class PackageDirector{

    public HolidayPackage createRelaxPackage(){
        PackageBuilder builder = new PackageBuilder();
        return builder.setFlight("Business Class").setHotel("5 Star Resort").setDailyActivity("Spa Treatment").build();
    }

    public HolidayPackage createAdventurePackage(){
        PackageBuilder builder = new PackageBuilder();
        return builder.setFlight("Economic Class").setHotel("Mountain Cabin").setDailyActivity("Hiking Tour").build();
    }
}

public class a2 {
    public static void main(String[] args) {
        PackageDirector director= new PackageDirector();

        HolidayPackage holyPackage= director.createRelaxPackage();

        holyPackage.print();
    }
}
