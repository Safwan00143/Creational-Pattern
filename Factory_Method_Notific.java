interface Notification{
    void send(String msg);
}

class EmailNotification implements Notification{
    public void send(String msg){
        System.out.println("From Email: "+msg);
    }
}

class SMSNotification implements Notification{
    public void send(String msg){
        System.out.println("From SMS: "+msg);
    }
}

abstract class NotificationFactory {
    abstract Notification createNotification();
}

class EmailFactory extends NotificationFactory{
    Notification createNotification(){
        return new EmailNotification();
    }
}

class SMSFactory extends NotificationFactory{
    Notification createNotification(){
        return new SMSNotification();
    }
}

public class Factory_Method_Notific {

    public static void main(String[] args) {
        NotificationFactory factory = new EmailFactory();
        Notification n = factory.createNotification();
        n.send("Factory method bananor try korlam!");
    }
}