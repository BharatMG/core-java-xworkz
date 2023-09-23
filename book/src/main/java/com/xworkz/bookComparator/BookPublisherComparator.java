package com.xworkz.bookComparator;

import com.xworkz.booksdto.BookDTO;

import java.util.Comparator;

public class BookPublisherComparator implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getPublisher().compareTo(o2.getPublisher());
    }
}
