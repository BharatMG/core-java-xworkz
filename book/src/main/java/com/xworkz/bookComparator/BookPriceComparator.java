package com.xworkz.bookComparator;

import com.xworkz.booksdto.BookDTO;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return (int) o1.getPrice()-(int) o2.getPrice();

    }
}
