interface Button{
    void paint();
}

interface Checkbox{
    void check();
}

class WindowsButton implements Button{
    public void paint(){
        System.out.println("Windows Button");
    }
}

class MacButton implements Button{
    public void paint(){
        System.out.println("Mac Button");
    }
}

class WindowsCheckbox implements Checkbox{
    public void check(){
        System.out.println("Windows Checkbox");
    }
}

class MacCheckbox implements Checkbox{
    public void check(){
        System.out.println("Mac Checkbox");
    }
}

abstract class Factory{
    abstract Button createButton();
    abstract Checkbox createCheckbox();
}

class WindowsFactory extends Factory{
    public Button createButton(){
        return new WindowsButton();
    }
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}

class MacFactory extends Factory{
    public Button createButton(){
        return new MacButton();
    }
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
}

public class Abstract_Factory_Method {
    public static void main(String[] args) {
        Factory f = new WindowsFactory();
        Button b = f.createButton();
        Checkbox c= f.createCheckbox();
        b.paint();
        c.check();
    }
}
