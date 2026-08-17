class BankDatabase{
    private static BankDatabase bankDBinstance = null;
    String dbName;
    String host;
    int port;
    int activeConnections;

    private BankDatabase(){
        dbName = "BankDB";
        host = "LocalHost";
        port = 10000;
        activeConnections = 0;

        System.out.println("Database Connection Created");
    }

    public static BankDatabase getInstance(){
        if(bankDBinstance==null){
            bankDBinstance = new BankDatabase();
        }

        return bankDBinstance;
    }

    public void connect(){
        System.out.println("Connected to " + dbName + ".");
    }

    public void disconnect(){
        System.out.println("Disconnected from " + dbName + ".");
    }

    public void increaseConnections(){
        activeConnections++;
        System.out.println("Active Connections: " + activeConnections);
    }

    public void decreaseConnections() {

        if (activeConnections > 0) {
            activeConnections--;
            System.out.println("Active Connections: " + activeConnections);
        }
        else {
            System.out.println("No active connections to remove.");
        }
    }

    public void showStatus() {

        System.out.println("\n----- DATABASE STATUS -----");
        System.out.println("Database Name      : " + dbName);
        System.out.println("Host               : " + host);
        System.out.println("Port               : " + port);
        System.out.println("Active Connections : " + activeConnections);
    }
}
public class Bank_DB_Singleton {
    public static void main(String[] args) {
        BankDatabase db1 = BankDatabase.getInstance();
        BankDatabase db2 = BankDatabase.getInstance();

        System.out.println("Are both objects same? " + (db1 == db2));
        System.out.println();

        db1.connect();

        db1.increaseConnections();
        db1.increaseConnections();

        db1.showStatus();
        System.out.println();

        db2.decreaseConnections();

        db2.disconnect();

        db2.showStatus();
    }
}
