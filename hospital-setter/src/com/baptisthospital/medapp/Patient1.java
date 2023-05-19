package com.baptisthospital.medapp;

public class Patient1 {
    private int patientId;
    private String patientName;
    private int age;
    private char gender;
    private String bloodgroup;
    private String place;
    private String consultant;
    private int wardNumber;
    private long mobileNumber;
    private String emailId;

    public void setPatientId(int patientId){
        this.patientId=patientId;
    }
    public int getPatientId(){
        return patientId;
    }
    public void setPatientName(String patientName){
        this.patientName=patientName;
    }
    public String getPatientName(){
        return patientName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
    public void setBloodGroup(String bloodgroup){
        this.bloodgroup=bloodgroup;
    }
    public String getBloodgroup(){
        return bloodgroup;
    }
    public void setPlace(String place){
        this.place=place;
    }
    public String getPlace(){
        return place;
    }
    public void setConsultant(String consultant){
        this.consultant=consultant;
    }
    public String getConsultant(){
        return consultant;
    }
    public void setWardNumber(int wardNumber){
        this.wardNumber=wardNumber;
    }
    public int getWardNumber(){
        return wardNumber;
    }
    public void setMobileNumber(long mobileNumber){
        this.mobileNumber=mobileNumber;
    }
    public long getMobileNumber(){
        return mobileNumber;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;
    }
    public String getEmailId(){
        return emailId;
    }
}
