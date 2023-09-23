package com.xworkz.fuelStation;

import com.xworkz.fuelStation.comparator.*;
import com.xworkz.fuelStation.dto.FuelStationDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FuelStationTester {
    public static void main(String[] args) {

        FuelStationDTO dto=new FuelStationDTO(1,"Bharat","rajajiNagar","petrol",10);
        FuelStationDTO dto1=new FuelStationDTO(3,"Hp","jayaNagar","diesel",8);
        FuelStationDTO dto2=new FuelStationDTO(5,"ONGC","ramNagar","Hydrogen",7);
        FuelStationDTO dto3=new FuelStationDTO(8,"Hindustan","KrishnarajNagar","Naturalgas",12);
        FuelStationDTO dto4=new FuelStationDTO(2,"IOC","Yelhanka","Ethanol",20);
        FuelStationDTO dto5=new FuelStationDTO(6,"Shell","Yeshwantpura","LPG",15);
        FuelStationDTO dto6=new FuelStationDTO(4,"TATA","mattikere","Coal",19);
        FuelStationDTO dto7=new FuelStationDTO(7,"Adani","CNG","petrol",25);

        List<FuelStationDTO> list=new ArrayList<FuelStationDTO>();
        list.add(dto);
        list.add(dto1);
        list.add(dto2);
        list.add(dto3);
        list.add(dto4);
        list.add(dto5);
        list.add(dto6);
        list.add(dto7);

        System.out.println("-------------------------------------sort by Id-----------------");
        Collections.sort(list);
        for (FuelStationDTO d:list) {
            System.out.println(d);
        }

        System.out.println("-------------------------------------sort by CompanyName-----------------");
        Collections.sort(list,new CompanyNameComparator());
        for (FuelStationDTO d:list) {
            System.out.println(d);
        }
        System.out.println("-------------------------------------sort by address-----------------");
        Collections.sort(list,new AddressComparator());
        for (FuelStationDTO d:list) {
            System.out.println(d);
        }
        System.out.println("-------------------------------------sort by TypeOfFuel-----------------");
        Collections.sort(list,new TypeOfFuelComparator());
        for (FuelStationDTO d:list) {
            System.out.println(d);
        }
        System.out.println("-------------------------------------sort by noOfWorkers-----------------");
        Collections.sort(list,new NoOFWorkersComparator());
        for (FuelStationDTO d:list) {
            System.out.println(d);
        }
        System.out.println("-------------------------------------sort by Id-----------------");
        Collections.sort(list,new IdComparator());
        for (FuelStationDTO d:list) {
            System.out.println(d);
        }
    }
}
