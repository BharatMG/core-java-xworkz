
import com.xworkz.patientapp.patient.Patient;
import com.xworkz.patientapp.constant.Gender;
import com.xworkz.patientapp.constant.IdProof;
import com.xworkz.patientapp.constant.Insured;
import com.xworkz.patientapp.hospital.Hospital;
import com.xworkz.patientapp.apolloImpl.ApolloImpl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PatientTester {
    public static void main(String[] args) {
        System.out.println("Main method invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the patient details..");
        int size = sc.nextInt();

        Hospital hospital = new ApolloImpl(size);
        for (int patientsIndex = 0; patientsIndex < size; patientsIndex++) {

            Patient patient = new Patient();
            System.out.println("enter the patient Id");
            patient.setId(sc.nextInt());
            System.out.println("enter the patient name");
            patient.setName(sc.next());
            System.out.println("enter the patient age");
            patient.setAge(sc.nextInt());
            System.out.println("enter the patient gender");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("enter the id proof ");
            patient.setIdProof(IdProof.valueOf(sc.next()));
            System.out.println("enter the mobile number..");
            patient.setMobileNumber(sc.nextLong());
            System.out.println("enter the wardNumber..");
            patient.setWardNumber(sc.next());
            System.out.println("enter the bedNumber ");
            patient.setBedNumber(sc.nextInt());
            System.out.println("enter the insured");
            patient.setInsured(Insured.valueOf(sc.next()));
            System.out.println("enter the address ");
            patient.setAddress(sc.next());
            System.out.println("enter the disease..");
            patient.setDisease(sc.next());
            hospital.addData(patient);

        }
        hospital.getAllData();

        System.out.println("enter again address...");
        hospital.getPatientByAddress(sc.next());

        System.out.println("enter again ward Number..");
        hospital.getPatientNameByWardNo(sc.next());

        System.out.println("enter again disease name");
        hospital.getPatientNameByDiseaseName(sc.next());

        System.out.println("enter the patient name...");
        System.out.println("enter the updated diseaseName...");
        hospital.updatePatientDiseaseByPatientName(sc.next(),sc.next());

        System.out.println("enter the patient Id..");
        System.out.println("enter the updated wardNumber..");
        hospital.updatedPatientWardNoByPatientId(sc.nextInt(), sc.next());
        hospital.getAllData();
        //System.out.println("enter again disease name");
        //hospital.getPatientNameByWardNo(sc.next());
        //System.out.println("updated disease...");
       // hospital.getPatientNameByWardNo(sc.next());
    }
}