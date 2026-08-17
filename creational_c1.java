package CSE_214_SWE_Sessional.Online_Other_Secs;

class AuditLogger{
    private static AuditLogger instance = null;
    private int studentCount;
    private boolean quesManagement;

    private AuditLogger(){
        System.out.println("AuditLogger created.");
    }

    public void log(String msg){
        System.out.println("Log: "+msg);
    }

    public static AuditLogger getInstance(){
        if(instance==null){
            instance = new AuditLogger();
        }

        return instance;
    }

}

class StudentLogin{
    public void Login(){
        AuditLogger logger = AuditLogger.getInstance();
        logger.log("Student logged in.");
    }
}

class QuestionManagement{
    public void addQuestion(){
        AuditLogger logger = AuditLogger.getInstance();
        logger.log("Added a new question.");
    }
}

public class creational_c1 {
    public static void main(String[] args) {
        StudentLogin s1 = new StudentLogin();
        QuestionManagement q1 = new QuestionManagement();

        s1.Login();
        q1.addQuestion();
    }
}
