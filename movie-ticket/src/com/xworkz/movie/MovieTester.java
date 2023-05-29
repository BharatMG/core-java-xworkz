package com.xworkz.movie;

import com.xworkz.movie.ticket.Ticket;

public class MovieTester {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Movie movie=new Movie(ticket);

        movie.ticket.toBook();

    }
}
