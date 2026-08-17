class GameSettings{
    private static GameSettings instance;

    private GameSettings(){
        System.out.println("Game Settings Created.");
    }

    public static GameSettings getInstance(){
        if(instance==null){
            instance = new GameSettings();
        }
        
        return instance;
    }
}

public class Singleton_Method {
    public static void main(String[] args) {
        GameSettings g1 = GameSettings.getInstance();
        GameSettings g2 = GameSettings.getInstance();
        System.out.println(g1==g2);
    }
}
