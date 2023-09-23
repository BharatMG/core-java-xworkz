package com.xworkz.tester;

import com.xworkz.booksdto.BookDTO;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<Integer, BookDTO> map = new HashMap<Integer, BookDTO>();
        map.put(1, new BookDTO(2, "ShriRamayanaDarshan", "kuvempu", "red", 1967, 700));
        map.put(2, new BookDTO(2, "ShriRamayanaDarshan", "kuvempu", "red", 1967, 700));
        //  System.out.println(map.get(1));
//         System.out. (map);

//        Set<Map.Entry<Integer,BookDTO>> bookSet= map.entrySet();
//        for (Map.Entry<Integer,BookDTO> bookEntry :bookSet) {
//            System.out.println(bookEntry.getKey());
//            System.out.println(bookEntry.getValue());
//        }

        //     Set<Map.Entry<Integer,BookDTO>> bookSet= map.entrySet();
        for (Map.Entry<Integer, BookDTO> bookEntry : map.entrySet()) {
            System.out.println(bookEntry.getKey());
            System.out.println(bookEntry.getValue());
        }

//        Set entryset= (Set) map.entrySet();
//      Iterator iterator= entryset.iterator();
//      while (iterator.hasNext()){
//          Map.Entry<Integer, BookDTO> bookDTOEntry=  (Map.Entry<Integer, BookDTO>) iterator.next();
//          System.out.println(bookDTOEntry.getKey());
//          System.out.println(bookDTOEntry.getValue());
//      }
    }
}
