package Prev_Year;
import java.util.Scanner;

interface Transport {
    void deliver();
}

class RoadTransport implements Transport {
    public void deliver() {
        System.out.println("Delivering via road.");
    }
}

class SeaTransport implements Transport {
    public void deliver() {
        System.out.println("Delivering via sea.");
    }
}

class TransportFactory {

    public static Transport createTransport(String type) {

        if (type.equalsIgnoreCase("Road")) {
            return new RoadTransport();
        }
        else if (type.equalsIgnoreCase("Sea")) {
            return new SeaTransport();
        }
        else {
            return null;
        }
    }
}

public class a1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter transport type (Road/Sea): ");
        String type = sc.nextLine();

        Transport transport = TransportFactory.createTransport(type);

        if (transport == null) {
            System.out.println("Invalid transport type.");
            return;
        }

        transport.deliver();
    }
}