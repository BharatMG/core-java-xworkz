package com.xworkz.fuelStation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FuelStationDTO implements Comparable<FuelStationDTO>{
    private int id;
    private String companyName;
    private String address;
    private String typeOfFuel;
    private int noOfWorkers;

    @Override
    public int compareTo(FuelStationDTO o) {
        return this.id-o.id;
    }
}
