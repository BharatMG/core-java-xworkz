package com.xworkz.bookComparator;

import com.xworkz.booksdto.BookDTO;

import java.util.Comparator;

public class BookNameComparator implements Comparator<BookDTO> {


    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }
}
