class PatientRunner {  
    public static void main(String[] args) {  
        Patient  patient  = new Patient ();  
        System.out.println("Patient  name: " + patient.name);  
        System.out.println("Patient  age: " + patient.age);  
        System.out.println("Patient  disease: " + patient.disease);  
        System.out.println("Patient  isAdmitted: " + patient.isAdmitted);  

        Patient.name = "Bob";  
        Patient.age = "60";  
        Patient.disease = "Diabetes";  
        Patient.isAdmitted = true;  

        System.out.println("Updated patient name: " + patient.name);  
        System.out.println("Updated age: " + patient.age);  
        System.out.println("Updated disease: " + patient.disease);  
        System.out.println("Updated isAdmitted: " + patient.isAdmitted);  
    }  
}