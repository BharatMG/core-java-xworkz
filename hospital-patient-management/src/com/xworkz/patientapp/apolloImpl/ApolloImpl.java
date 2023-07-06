package com.xworkz.patientapp.apolloImpl;

import com.xworkz.patientapp.exception.DiseaseNameNotFoundException;
import com.xworkz.patientapp.exception.IdNotFoundException;
import com.xworkz.patientapp.exception.NameNotFoundException;
import com.xworkz.patientapp.exception.WardNoNotFoundException;
import com.xworkz.patientapp.patient.Patient;
import com.xworkz.patientapp.hospital.Hospital;

import java.sql.SQLOutput;

public class ApolloImpl implements Hospital {

    Patient patient[];
    int i = 0;


    public ApolloImpl(int size) {
        patient = new Patient[size];
    }

    @Override
    public boolean addData(Patient patient) {
        System.out.println("invoked patient method");
        boolean isAdded = false;
        try {
            if (patient != null) {
                System.out.println("patient check completed..proceed to add patient");
                if (patient.getName() != null && !patient.getName().isEmpty()) {
                    this.patient[i++] = patient;
                    isAdded = true;
                    System.out.println("patient data added...");
                } else {
                    System.out.println("no patient data available");
                }
            } else {
                System.out.println("not added");
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        return isAdded;
    }
    @Override
    public String getPatientNameByWardNo(String wardNo) {
        System.out.println("wardNumber is invoked..");
        String s=null;
            for (int i = 0; i <= patient.length; i++) {
                if (patient[i].getWardNumber().equals(wardNo)) {
                    System.out.println(s=patient[i].getName());
                    System.out.println("...........get the name:....");
                } else {
                    WardNoNotFoundException exception = new WardNoNotFoundException(wardNo);
                    throw exception;
                }
            }
        return "s";
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {
        System.out.println("get patient name by diseaseName method invoked");
        String[] patientNames = new String[3];
        try {
            for (int i = 0; i < patient.length; i++) {
                if (patient[i].getDisease().equals(diseaseName)) {
                    System.out.println(patient[i].getName());
                    System.out.println("....get the patient name....");
                } else {
                    DiseaseNameNotFoundException exception=new DiseaseNameNotFoundException(diseaseName);
                    System.out.println("no such data found...");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
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
                    NameNotFoundException exception=new NameNotFoundException(existingPatientName);
                    throw exception;
                }
                    System.out.println("No such data available");
        }
        return isUpdated;
    }

    @Override
    public boolean updatedPatientWardNoByPatientId(int existingId, String updatedWardNumber) {
        System.out.println("update patient wardNumber method invoked");
        boolean isUpdated = false;
        try {
            for (int i = 0; i < patient.length; i++) {
                if (patient[i].getId() == existingId) {
                    patient[i].setWardNumber(updatedWardNumber);
                    isUpdated = true;
                    System.out.println(".........wardNumber is updated....");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updatedPatientAgeByPatientId(int existingId, int updatedAge) {
        System.out.println("update patient Age meThod invoked.");
        boolean isUpdated = false;
        try {
            for (int i = 0; i < patient.length; i++) {
                if (patient[i].getId() == existingId) {
                    patient[i].setAge(updatedAge);
                    isUpdated = true;
                    System.out.println(".............Age is updated....");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public Patient getPatientById(int patientId) {
        System.out.println("get patient by id method invoked.");
        Patient pat1=null;
            for (int i = 0; i < patient.length; i++) {
                if (patient[i].getId() == patientId) {
                    System.out.println(pat1=patient[i]);
                }else {
                    IdNotFoundException exception=new IdNotFoundException(patientId);
                    throw exception;
                }
        }
        return pat1;
    }

    @Override
    public String getPatientCityByPatientId(int patientId) {
        try {
            System.out.println("get patient doorNumber method invoked");
            for (int i = 0; i < patient.length; i++) {
                if (patient[i].getId() == patientId) {
                    System.out.println(patient[i].getAddress().getCountry().getState().getCity());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void getAllData() {
        System.out.println("invoke getAll details");
        System.out.println("list of all patient details");
        try {
            for (Patient patient : this.patient) {
                System.out.println(patient);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}