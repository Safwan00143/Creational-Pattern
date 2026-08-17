class Logger {

    private static Logger instance;

    private Logger() {
        System.out.println("Logger instance created.");
    }

    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}


class ClientOne {

    public void performOperation() {

        Logger logger = Logger.getInstance();

        logger.log("Client One: Deposit transaction recorded.");
    }
}


class ClientTwo {

    public void performOperation() {

        Logger logger = Logger.getInstance();

        logger.log("Client Two: Withdrawal transaction recorded.");
    }
}


public class b1 {

    public static void main(String[] args) {

        ClientOne client1 = new ClientOne();
        ClientTwo client2 = new ClientTwo();

        client1.performOperation();
        client2.performOperation();

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(
            "Are both Logger instances the same? "
            + (logger1 == logger2)
        );
    }
}