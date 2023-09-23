package com.xworkz.fuelStation.comparator;

import com.xworkz.fuelStation.dto.FuelStationDTO;

import java.util.Comparator;

public class CompanyNameComparator implements Comparator<FuelStationDTO> {
    @Override
    public int compare(FuelStationDTO o1, FuelStationDTO o2) {
        return o1.getCompanyName().compareTo(o2.getCompanyName());
    }
}
