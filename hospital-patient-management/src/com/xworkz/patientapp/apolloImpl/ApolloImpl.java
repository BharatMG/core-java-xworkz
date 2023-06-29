package com.xworkz.patientapp.apolloImpl;

import com.xworkz.patientapp.patient.Patient;
import com.xworkz.patientapp.hospital.Hospital;

import java.sql.SQLOutput;

public class ApolloImpl implements Hospital {

    Patient patient[];
    int i =0;


    public ApolloImpl(int size){
        patient = new Patient[size];
    }

    @Override
    public boolean addData(Patient patient) {
        System.out.println("invoked patient method");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("patient check completed..proceed to add patient");
            if (patient.getName() != null && !patient.getName().isEmpty()) {
                this.patient[i++] = patient;
             //   i++;
                isAdded = true;
                System.out.println("patient data added...");
            } else {
                System.out.println("no patient data available");
            }
        } else {
            System.out.println("not added");
        }
        return isAdded;
    }

    @Override
    public Patient getPatientByAddress(String address) {
        System.out.println("comparing address invoked");

        for (int i = 0; i < patient.length; i++) {

            if (patient[i].getAddress().equals(address)) {
                // this.patient[i] = patient[i];
                System.out.println(patient[i]);
                System.out.println("comparing the address value matched");
            } else {
                System.out.println("No such data......");
            }
        }
        return null;
    }

    @Override
    public String getPatientNameByWardNo    (String wardNo) {
        System.out.println("wardNumber is invoked..");
        for (int i = 0; i < patient.length; i++) {
            if (patient[i].getWardNumber().equals(wardNo)) {
                //System.out.println(patient[i]);
                //if (patient[i].getName().equals(wardNo)) {
                System.out.println(patient[i].getName());
                System.out.println("...........get the name:....");
            } else {
                System.out.println("NO ward number matched..");
            }
        }

        return null;
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {
        System.out.println("get patient name by diseaseName method invoked");
       String[] patientNames = new String[3];
       // int patientIndex = 0;
        for (int i = 0; i < patient.length; i++) {
            if (patient[i].getDisease().equals(diseaseName)) {
                System.out.println(patient[i].getName());
                System.out.println("....get the patient name....");
            }
            else {
                System.out.println("no such data found...");
            }
        }
        return patientNames;
    }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingPatientName, String updatedDisease) {
        System.out.println("updated patient disease method invoked");
        boolean isUpdated = false;
        for (int i = 0; i < patient.length; i++) {
            if (patient[i].getName().equals(existingPatientName)) {
                patient[i].setDisease(updatedDisease);
                System.out.println("enter the updated disease name");
                isUpdated = true;
                System.out.println(".................disease name updated...");
            } else {
                System.out.println("No such data available");
            }
        }
        return isUpdated;
    }

    @Override
    public boolean updatedPatientWardNoByPatientId(int existingId, String updatedWardNumber) {
        System.out.println("update patient wardNumber method invoked");
        boolean isUpdated = false;
        for (int i = 0; i < patient.length; i++) {
            if (patient[i].getId() == existingId) {
                patient[i].setWardNumber(updatedWardNumber);
                isUpdated = true;
                System.out.println(".........wardNumber is updated....");
            }
        }
        return isUpdated;
    }

    @Override
    public boolean updatedPatientAgeByPatientId(int existingId, int updatedAge) {
        System.out.println("update patient Age meThod invoked.");
        boolean isUpdated = false;
        for (int i = 0; i < patient.length; i++) {
            if (patient[i].getId() == existingId) {
                patient[i].setAge(updatedAge);
                isUpdated = true;
                System.out.println(".............Age is updated....");
            }
        }
        return isUpdated;
    }

    @Override
    public Patient getPatientById(int patientId) {
        System.out.println("get patient by id method invoked.");
        for (int i = 0; i < patient.length; i++) {
            if (patient[i].getId() == patientId) {
                System.out.println(patient);
            }
        }
        return null;
    }

    @Override
    public String getPatientCityByPatientId(int patientId) {
        //  String cName=null;
        System.out.println("get patient doorNumber method invoked");
        for (int i = 0; i < patient.length; i++) {
            if (patient[i].getId() == patientId) {
                System.out.println(patient[i].getAddress().getCountry().getState().getCity());

            }
        }
        return null;
    }


    @Override
    public void getAllData() {
        System.out.println("invoke getAll details");
        System.out.println("list of all patient details");
        for (Patient patient :this.patient) {
            System.out.println(patient);
        }

    }
}