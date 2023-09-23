package com.xworkz.currency.dto.comparator;

import com.xworkz.currency.dto.CurrencyDTO;

import java.util.Comparator;

public class CountryComparator implements Comparator<CurrencyDTO> {
    @Override
    public int compare(CurrencyDTO o1, CurrencyDTO o2) {
        return o1.getCountry().compareTo(o2.getCountry());
    }
}
