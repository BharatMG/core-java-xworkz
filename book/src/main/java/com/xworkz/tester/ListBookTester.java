package com.xworkz.tester;

import com.xworkz.bookComparator.*;
import com.xworkz.booksdto.BookDTO;

import java.util.*;

public class ListBookTester {
    public static void main(String[] args) {
        List<BookDTO> list = new ArrayList<BookDTO>();

        list.add(new BookDTO(2, "ShriRamayanaDarshan", "kuvempu", "red",1967, 700));
        list.add(new BookDTO(5, "Nakutanti", "darabendra", "black",1973, 300));
        list.add(new BookDTO(4, "MukajjiyaKanasugalu", "ShivaramKarant", "black",1977, 250));
        list.add(new BookDTO(1, "ChikkaviraRajendra", "MastiVenkateshAyangar", "black",1983, 300));
        list.add(new BookDTO(3, "BharatSinduRashmi", "V.k.Gokak", "black",1973, 300));
        list.add(new BookDTO(6, "SamagraSahitya", "URAnanthmurthi", "black",1994, 300));
        list.add(new BookDTO(7, "SamagraSahitya", "GirishKarand", "black",1998, 300));
        list.add(new BookDTO(8, "SamagraSahitya", "ChandraShekarKambar", "black",2010, 300));


        System.out.println("=================sort by Id==============================");
        Collections.sort(list);
        for (BookDTO b : list) {
            System.out.println(b);
        }

       System.out.println("=================sort by Name==============================");
        Collections.sort(list,new BookNameComparator());
        for (BookDTO b : list) {
            System.out.println(b);
        }
        System.out.println("==================================sort by AuthorName==========================================");
        Collections.sort(list,new BookAuthorNameComparator());
        for (BookDTO b : list) {
            System.out.println(b);
        }
        System.out.println("=======================================sort by publisher====================================================");
        Collections.sort(list,new BookPublisherComparator());
        for (BookDTO b : list) {
            System.out.println(b);
        }
        System.out.println("=======================================sort by price====================================================");
        Collections.sort(list,new BookPriceComparator());
        for (BookDTO b : list) {
            System.out.println(b);
        }
        System.out.println("=======================================sort by YearOfPublish====================================================");
        Collections.sort(list,new YearOfPublishComparable());
        for (BookDTO b : list) {
            System.out.println(b);
        }
        List<BookDTO> list1 = new LinkedList<BookDTO>();

        list.add(new BookDTO(2, "ShriRamayanaDarshan", "kuvempu", "red",1967, 700));
        list.add(new BookDTO(5, "Nakutanti", "darabendra", "black",1973, 300));
        list.add(new BookDTO(4, "MukajjiyaKanasugalu", "ShivaramKarant", "black",1977, 250));
        list.add(new BookDTO(1, "ChikkaviraRajendra", "MastiVenkateshAyangar", "black",1983, 300));
        list.add(new BookDTO(3, "BharatSinduRashmi", "V.k.Gokak", "black",1973, 300));
        list.add(new BookDTO(6, "SamagraSahitya", "URAnanthmurthi", "black",1994, 300));

        Iterator it = list1.iterator();
        while (it.hasNext()) {
            BookDTO b= (BookDTO) it.next();
            System.out.println(b);
        }
    }
}
