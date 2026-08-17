interface Report{
    void open();
    void generate();
}

class PDF implements Report{
    public void open(){
        System.out.println("Opening a PDF");
    }
    public void generate(){
        System.out.println("Generating a PDF.");
    }
}

class Word implements Report{
    public void open(){
        System.out.println("Opening a Word");
    }
    public void generate(){
        System.out.println("Generating a Word.");
    }
}

class HTML implements Report{
    public void open(){
        System.out.println("Opening a HTML");
    }
    public void generate(){
        System.out.println("Generating a HTML.");
    }
}

abstract class ReportProcessor{
    public void processReport(){
        Report report= createReport();
        report.open();
        report.generate();
        System.out.println("Completed report processing!");
    }

    abstract Report createReport();
}

class PDFProcessor extends ReportProcessor{
    protected Report createReport(){
        return new PDF();
    }
}

class WordProcessor extends ReportProcessor{
    protected Report createReport(){
        return new Word();
    }
}

class HTMLProcessor extends ReportProcessor{
    protected Report createReport(){
        return new HTML();
    }
}

public class creational_B2 {
    public static void main(String[] args) {
        ReportProcessor reportProcessor= new PDFProcessor();
        reportProcessor.processReport();
    }
}
