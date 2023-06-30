package com.xworkz.patientapp.hospital;

import com.xworkz.patientapp.patient.Patient;

public interface Hospital {

    abstract boolean addData(Patient patient);

    public Patient getPatientByAddress(String address) ;

    String getPatientNameByWardNo(String wardNo);

    String[] getPatientNameByDiseaseName(String diseaseName);
    boolean updatePatientDiseaseByPatientName(String existingPatientName,String updatedDisease);

    boolean updatedPatientWardNoByPatientId(int existingId,String updatedWardNumber);
     abstract void getAllData();
}