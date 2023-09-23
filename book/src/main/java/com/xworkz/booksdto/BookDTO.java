package com.xworkz.booksdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class BookDTO implements Comparable<BookDTO> {

    private int bookId;
    private String bookName;
    private String authorName;
    private String publisher;
    private int yearOfPublish;
    private double price;

    @Override
    public int compareTo(BookDTO o) {
        return this.getBookId()-o.getBookId();
    }
}
