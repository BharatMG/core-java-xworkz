package com.xworkz.currency;

import com.xworkz.currency.dto.CurrencyDTO;
import com.xworkz.currency.dto.comparator.CountryComparator;
import com.xworkz.currency.dto.comparator.CurrencyNameComparator;
import com.xworkz.currency.dto.comparator.YearOfPrintComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CurrencyTester {

    public static void main(String[] args) {

        CurrencyDTO dto=new CurrencyDTO(1,"india","rupee",1999);
        CurrencyDTO dto1=new CurrencyDTO(2,"srilanka","rupee",1954);
        CurrencyDTO dto2=new CurrencyDTO(3,"malysia","ringgit",1965);
        CurrencyDTO dto3=new CurrencyDTO(6,"america","doller",1989);
        CurrencyDTO dto4=new CurrencyDTO(4,"america","doller",1912);
        CurrencyDTO dto5=new CurrencyDTO(5,"america","doller",1909);

        List<CurrencyDTO> list=new ArrayList<CurrencyDTO>();
        list.add(dto);
        list.add(dto1);
        list.add(dto2);
        list.add(dto3);
        list.add(dto4);
        list.add(dto5);

        System.out.println("-----------------------sort by Id--------------");
        Collections.sort(list);
        for (CurrencyDTO d:list) {
            System.out.println(d);
        }

        System.out.println("-----------------------sort by country--------------");
        Collections.sort(list,new  CountryComparator());
        for (CurrencyDTO d:list) {
            System.out.println(d);
        }
        System.out.println("-----------------------sort by CurrencyName--------------");
        Collections.sort(list,new CurrencyNameComparator());
        for (CurrencyDTO d:list) {
            System.out.println(d);
        }
        System.out.println("-----------------------sort by YearOfPrint--------------");
        Collections.sort(list,new YearOfPrintComparator());
        for (CurrencyDTO d:list) {
            System.out.println(d);
        }
    }
}
