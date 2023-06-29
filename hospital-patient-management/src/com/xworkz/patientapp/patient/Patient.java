package com.xworkz.patientapp.patient;

import com.xworkz.patientapp.constant.Gender;
import com.xworkz.patientapp.constant.IdProof;
import com.xworkz.patientapp.constant.Insured;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Data
public class Patient {

    private int id;
    private String name;
    private int age;
    public Gender gender;
    public IdProof idProof;
    public Insured insured;
    private long mobileNumber;
    private String wardNumber;
    private int bedNumber;
    private String address;
    private String disease;

}
