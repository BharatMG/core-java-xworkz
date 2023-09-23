package com.xworkz.bookComparator;

import com.xworkz.booksdto.BookDTO;

import java.util.Comparator;

public class BookAuthorNameComparator implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getAuthorName().compareTo(o2.getAuthorName());
    }
}
