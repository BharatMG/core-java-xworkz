package com.xworkz.currency.dto;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class CurrencyDTO implements Comparable<CurrencyDTO> {

    private int id;
    private  String country;
    private String currencyName;
    private int yearOfPrint;

    @Override
    public int compareTo(CurrencyDTO o) {
        return this.id-o.id;
    }
}
