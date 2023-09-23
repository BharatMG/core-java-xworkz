package com.xworkz.tester;

import com.xworkz.booksdto.BookDTO;

import java.util.Set;
import java.util.TreeSet;

public class SetBookTesterSet {
    public static void main(String[] args) {
        Set<BookDTO> set=new TreeSet<BookDTO>();

        set.add(new BookDTO(2, "ShriRamayanaDarshan", "kuvempu", "red",1967, 700));
        set.add(new BookDTO(5, "Nakutanti", "darabendra", "black",1973, 300));
        set.add(new BookDTO(4, "MukajjiyaKanasugalu", "ShivaramKarant", "black",1977, 250));
        set.add(new BookDTO(1, "ChikkaviraRajendra", "MastiVenkateshAyangar", "black",1983, 300));
        set.add(new BookDTO(3, "BharatSinduRashmi", "V.k.Gokak", "black",1973, 300));
        set.add(new BookDTO(6, "SamagraSahitya", "URAnanthmurthi", "black",1994, 300));
        set.add(new BookDTO(7, "SamagraSahitya", "GirishKarand", "black",1998, 300));
        set.add(new BookDTO(8, "SamagraSahitya", "ChandraShekarKambar", "black",2010, 300));

        for (BookDTO b:set) {
            System.out.println(b);
        }
    }
}
