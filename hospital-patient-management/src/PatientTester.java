
import com.xworkz.patientapp.address.*;
import com.xworkz.patientapp.patient.Patient;
import com.xworkz.patientapp.constant.Gender;
import com.xworkz.patientapp.constant.IdProof;
import com.xworkz.patientapp.constant.Insured;
import com.xworkz.patientapp.hospital.Hospital;
import com.xworkz.patientapp.apolloImpl.ApolloImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;
import java.util.Scanner;

//@NoArgsConstructor
//@AllArgsConstructor
public class PatientTester {

    public static void main(String[] args) {
        System.out.println("Main method invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the patient details..");
        int size = sc.nextInt();

        Hospital hospital = new ApolloImpl(size);
        for (int patientsIndex = 0; patientsIndex < size; patientsIndex++) {


            //   Patient patient1=new Address();

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

            System.out.println("enter the disease..");
            patient.setDisease(sc.next());



            DoorNumber doorNumber = new DoorNumber();
            Street street = new Street();
            Area area = new Area();
            City city = new City();
            State state = new State();
            Country country = new Country();
            Address address = new Address();


            System.out.println("Enter Door Number");
            doorNumber.setDoorNo(sc.nextInt());
            System.out.println(" Enter Street Number");
            street.setStreet(sc.next());
            System.out.println("Enter Area name");
            area.setArea(sc.next());
            System.out.println("Enter City Name");
            city.setCity(sc.next());
            System.out.println("Enter State name");
            state.setState(sc.next());
            System.out.println("Enter the Country Name");
            country.setCountry(sc.next());

            hospital.addData(patient);

                street.setDoorNumber(doorNumber);
            area.setStreet(street);
            city.setArea(area);
            state.setCity(city);
            country.setState(state);
            address.setCountry(country);
            patient.setAddress(address);


        }
        String text;
        do {
            System.out.println("1.get all the patient details");
            System.out.println("2.get the patient name by ward Number");
            System.out.println("3.get the patient name by disease name");
            System.out.println("4.update the disease name by patient name ");
            System.out.println("5.update ward number by patient id");
            System.out.println("6.update age by patient id");
            System.out.println("7.get patient detail by patient id");
            System.out.println("8.get patient city by patient id ");
            System.out.println("9.get patient name by ward Number");
            System.out.println("10.get patient by address");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("list of all patients are ");
                    hospital.getAllData();
                    break;
                case 2:
                    System.out.println("enter again ward Number..");
                    hospital.getPatientNameByWardNo(sc.next());
                    break;
                case 3:
                    System.out.println("enter again disease name");
                    hospital.getPatientNameByDiseaseName(sc.next());
                    break;
                case 4:
                    System.out.println("enter the patient name...");
                    System.out.println("enter the updated diseaseName...");
                    hospital.updatePatientDiseaseByPatientName(sc.next(), sc.next());
                    break;
                case 5:
                    System.out.println("enter the patient Id..");
                    System.out.println("enter the updated wardNumber..");
                    hospital.updatedPatientWardNoByPatientId(sc.nextInt(), sc.next());
                    break;
                case 6:
                    System.out.println("enter the existing patient Id:");
                    System.out.println("Enter the updated age..");
                    hospital.updatedPatientAgeByPatientId(sc.nextInt(), sc.nextInt());
                    break;
                case 7:
                    System.out.println("enter the existing patient id..");
                    hospital.getPatientById(sc.nextInt());
                    break;
                case 8:
                    System.out.println("enter the existing patient Id..");
                    hospital.getPatientCityByPatientId(sc.nextInt());
                    break;
                case 9:
                    System.out.println("enter again disease name");
                    hospital.getPatientNameByWardNo(sc.next());
                    break;
                case 10:
                    System.out.println("enter the address...");
                    hospital.getPatientByAddress(sc.next());
                    break;
                default:
                    System.out.println("Enter valid option!!!");
            }
            System.out.println("Do you want to continue :yes/no");
            text = sc.next();
        }
        while (text.equals("yes"));
        //
        // hospital.getAllData();
        System.out.println(".......thank you for using patient application...");
        // String[] patientNameByDiseaseName =

        // for (String p : patientNameByDiseaseName) {
        //   System.out.println(p);
    }
}
