package CSE_214_SWE_Sessional.Previous_Onlines;

import java.util.Scanner;

interface Transport{
    void deliver();
}

class RoadTransport implements Transport{
    public void deliver(){
        System.out.println("Delivering via Road.");
    }
}

class SeaTransport implements Transport{
    public void deliver(){
        System.out.println("Delivering via Road.");
    }
}

abstract class TransportFactory{
    abstract Transport createTransport();
}

class TruckFactory extends TransportFactory{
    public Transport createTransport(){
        return new RoadTransport();
    }
}

class ShipFactory extends TransportFactory{
    public Transport createTransport(){
        return new SeaTransport();
    }
}

public class a1_2022_creational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter transport type(Road/sea): ");
        String type = sc.nextLine();
        
        TransportFactory factory;

        if(type.equalsIgnoreCase("Road")){
            factory = new TruckFactory();
        }
        else if(type.equalsIgnoreCase("Sea")){
            factory = new ShipFactory();
        }
        else{
            System.out.println("Invalid transport type.");
            return;
        }

        Transport transport = factory.createTransport();
        transport.deliver();
    }
}
