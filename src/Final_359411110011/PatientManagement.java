package Final_359411110011;

import java.util.List;
import java.util.Scanner;

public class PatientManagement {

    public static void main(String[] args) {
        
        PatientDAOImpl dao = PatientDAOImpl.getInstance();
        //displayAllPatient(dao);
        //addNewPatient(dao);
        //findPatiert(dao);
        //UpdatPatientByID(dao);
        deletePatientByID(dao);

    }//

    private static void deletePatientByID(PatientDAOImpl dao) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient ID that you want to delete: ");
        int id = Integer.parseInt(sc.nextLine());
        dao.deletePAT(id);
    }//

    private static void UpdatPatientByID(PatientDAOImpl dao) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient ID: ");
        int id = Integer.parseInt(sc.nextLine());
        Patient PAT = dao.findPAT(id);
        System.out.print(PAT.toString());

        System.out.print("Enter new Bloob result for Patient ID: "+PAT.getP_id());
        

    }//

    private static void findPatiert(PatientDAOImpl dao) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient ID: ");
        int id = Integer.parseInt(sc.nextLine());
        Patient PAT = dao.findPAT(id);
        System.out.print(PAT.toString());
    }//

    private static void addNewPatient(PatientDAOImpl dao) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient ID. ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Patient Name. ");
        String p_name = sc.nextLine();
        System.out.print("Enter Patient gender. ");
        String p_gender = sc.nextLine();
        System.out.print("Enter Patient Age. ");
        int p_age = Integer.parseInt (sc.nextLine());
        System.out.print("Enter Patient address. ");
        String p_address = sc.nextLine();
        System.out.print("Enter Patient blood result");
        String p_blood_result = sc.nextLine();

        dao.addPAT(new Patient(id,p_name,p_gender,p_age,p_address,p_blood_result));

    }//

    private static void displayAllPatient(PatientDAOImpl dao) {
        List<Patient> PAT = dao.getAllPAT();
        for (Patient p:PAT){
            System.out.println(p.toString());
        }
    }

}
