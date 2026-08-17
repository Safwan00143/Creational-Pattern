interface Evaluator{
    void evaluate();
    void calculateMarks();
    void generateReport();
}

class CSEevaluator implements Evaluator{
    
    public void evaluate(){
        System.out.println("Evaluated from CSE");;
    }
    public void calculateMarks(){
        System.out.println("Calculated CSE marks");
    }
    public void generateReport(){
        System.out.println("CSE report generated");
    }
}

class EEEevaluator implements Evaluator{
    public void evaluate(){
        System.out.println("Evaluated from EEE");;
    }
    public void calculateMarks(){
        System.out.println("Calculated EEE marks");
    }
    public void generateReport(){
        System.out.println("EEE report generated");
    }}

class MEevaluator implements Evaluator{
        public void evaluate(){
        System.out.println("Evaluated from ME");;
    }
    public void calculateMarks(){
        System.out.println("Calculated ME marks");
    }
    public void generateReport(){
        System.out.println("ME report generated");
    }
}

abstract class Factory{
    abstract Evaluator createEvaluator();
}

class CSEFactory extends Factory{
    public Evaluator createEvaluator(){
        return new CSEevaluator();
    }
}

class EEEFactory extends Factory{
    Evaluator createEvaluator(){
        return new EEEevaluator();
    }
}

class MEFactory extends Factory{
    Evaluator createEvaluator(){
        return new MEevaluator();
    }
}

public class Factory_Practice {
  public static void main(String[] args) {
    Factory factory = new CSEFactory();
    Evaluator e = factory.createEvaluator();
    e.evaluate();
  }  
}
