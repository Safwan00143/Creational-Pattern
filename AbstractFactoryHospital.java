interface Doctor {
    void diagnose();
    void treatPatient(String patientName);
    void displayInfo();
}

interface MedicalReport {
    void generateReport();
    void printSummary();
}

// ========================= GENERAL HOSPITAL =========================

class GeneralDoctor implements Doctor {

    String staffName;
    int experienceYears;
    String department;

    public GeneralDoctor(String staffName, int experienceYears, String department) {
        this.staffName = staffName;
        this.experienceYears = experienceYears;
        this.department = department;
    }

    @Override
    public void diagnose() {
        System.out.println("Diagnosing at General Hospital.");
    }

    @Override
    public void treatPatient(String patientName) {
        System.out.println("Treating " + patientName + ".");
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor Name : " + staffName);
        System.out.println("Experience  : " + experienceYears + " years");
        System.out.println("Department  : " + department);
        System.out.println("Hospital    : General Hospital");
    }
}

class GeneralReport implements MedicalReport {

    String patientName;
    int patientID;
    String doctorName;
    String hospitalName;

    public GeneralReport(String patientName,
                         int patientID,
                         String doctorName,
                         String hospitalName) {

        this.patientName = patientName;
        this.patientID = patientID;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
    }

    @Override
    public void generateReport() {
        System.out.println("Medical Report Generated Successfully.");
    }

    @Override
    public void printSummary() {

        System.out.println("\n----- GENERAL HOSPITAL REPORT -----");
        System.out.println("Hospital : " + hospitalName);
        System.out.println("Patient  : " + patientName);
        System.out.println("Patient ID : " + patientID);
        System.out.println("Doctor   : " + doctorName);
    }
}

// ========================= CARDIAC HOSPITAL =========================

class CardiacDoctor implements Doctor {

    String staffName;
    int experienceYears;
    String department;

    public CardiacDoctor(String staffName, int experienceYears, String department) {
        this.staffName = staffName;
        this.experienceYears = experienceYears;
        this.department = department;
    }

    @Override
    public void diagnose() {
        System.out.println("Diagnosing at Cardiac Hospital.");
    }

    @Override
    public void treatPatient(String patientName) {
        System.out.println("Treating " + patientName + ".");
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor Name : " + staffName);
        System.out.println("Experience  : " + experienceYears + " years");
        System.out.println("Department  : " + department);
        System.out.println("Hospital    : Cardiac Hospital");
    }
}

class CardiacReport implements MedicalReport {

    String patientName;
    int patientID;
    String doctorName;
    String hospitalName;

    public CardiacReport(String patientName,
                         int patientID,
                         String doctorName,
                         String hospitalName) {

        this.patientName = patientName;
        this.patientID = patientID;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
    }

    @Override
    public void generateReport() {
        System.out.println("Medical Report Generated Successfully.");
    }

    @Override
    public void printSummary() {

        System.out.println("\n----- CARDIAC HOSPITAL REPORT -----");
        System.out.println("Hospital : " + hospitalName);
        System.out.println("Patient  : " + patientName);
        System.out.println("Patient ID : " + patientID);
        System.out.println("Doctor   : " + doctorName);
    }
}

// ========================= ABSTRACT FACTORY =========================

abstract class HospitalFactory {

    abstract Doctor createDoctor(String name,
                                 int experienceYears,
                                 String department);

    abstract MedicalReport createMedicalReport(String patientName,
                                               int patientID,
                                               String doctorName);
}

// ========================= CONCRETE FACTORIES =========================

class GeneralFactory extends HospitalFactory {

    @Override
    Doctor createDoctor(String name,
                        int experienceYears,
                        String department) {

        return new GeneralDoctor(name, experienceYears, department);
    }

    @Override
    MedicalReport createMedicalReport(String patientName,
                                      int patientID,
                                      String doctorName) {

        return new GeneralReport(
                patientName,
                patientID,
                doctorName,
                "General Hospital"
        );
    }
}

class CardiacFactory extends HospitalFactory {

    @Override
    Doctor createDoctor(String name,
                        int experienceYears,
                        String department) {

        return new CardiacDoctor(name, experienceYears, department);
    }

    @Override
    MedicalReport createMedicalReport(String patientName,
                                      int patientID,
                                      String doctorName) {

        return new CardiacReport(
                patientName,
                patientID,
                doctorName,
                "Cardiac Hospital"
        );
    }
}

// ========================= MAIN =========================

public class AbstractFactoryHospital {

    public static void main(String[] args) {

        // Change only this line to switch the whole hospital family
        HospitalFactory factory = new CardiacFactory();
        // HospitalFactory factory = new GeneralFactory();

        Doctor doctor = factory.createDoctor(
                "Dr. Ahmed",
                12,
                "Cardiology"
        );

        MedicalReport report = factory.createMedicalReport(
                "Safwan Mahdi",
                2305087,
                "Dr. Ahmed"
        );

        doctor.displayInfo();
        System.out.println();

        doctor.diagnose();
        doctor.treatPatient("Safwan Mahdi");

        System.out.println();

        report.generateReport();
        report.printSummary();
    }
}