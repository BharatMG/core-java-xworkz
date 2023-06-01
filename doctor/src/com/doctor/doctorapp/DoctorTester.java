package com.doctor.doctorapp;

import com.doctor.doctorapp.doctor.Doctor;
import com.doctor.doctorapp.surgeon.Surgeon;

public class DoctorTester {
    public static void main(String[] args) {
        Doctor doctor=new Surgeon(1,"bharat","paediatrician");
        doctor.toDiagnosis();
    }
}
