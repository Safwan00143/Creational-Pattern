package CSE_214_SWE_Sessional.Online_Other_Secs;

interface Button{
    void print();
}

interface TextField{
    void addText();
}

interface DialogBox{
    void createDialogBox();
}

class LightButton implements Button{
    public void print(){
        System.out.println("Light Button.");
    }
}

class LightTextField implements TextField{
    public void addText(){
        System.out.println("Added text in light mode.");
    }
}

class LightDialogBox implements DialogBox{
    public void createDialogBox(){
        System.out.println("Created a light dialog box.");
    }
}

class DarkButton implements Button{
    public void print(){
        System.out.println("Dark Button.");
    }
}

class DarkTextField implements TextField{
    public void addText(){
        System.out.println("Added text in Dark mode.");
    }
}

class DarkDialogBox implements DialogBox{
    public void createDialogBox(){
        System.out.println("Created a Dark dialog box.");
    }
}

abstract class ThemeFactory{
    abstract Button createButton();
    abstract TextField createTextField();
    abstract DialogBox createDialogBox();
}

class LightTheme extends ThemeFactory{
    public Button createButton(){
        return new LightButton();
    }
    public TextField createTextField(){
        return new LightTextField();
    }
    public DialogBox createDialogBox(){
        return new LightDialogBox();
    }
}

class DarkTheme extends ThemeFactory{
    public Button createButton(){
        return new DarkButton();
    }
    public TextField createTextField(){
        return new DarkTextField();
    }
    public DialogBox createDialogBox(){
        return new DarkDialogBox();
    }
}

public class creational_a1 {
    public static void main(String[] args) {
        ThemeFactory l1 = new LightTheme();
        ThemeFactory d1 = new DarkTheme();

        Button lb = l1.createButton();
        lb.print();

        TextField dtf = d1.createTextField();

        dtf.addText();
    }
}
