package com.flightbookingsystem;

public class Booking {
    private Passenger passenger;
    private Flight flight;
    private String date;

    public Booking (Passenger passenger , Flight flight , String date) {
        this.passenger = passenger;
        this.flight = flight;
        this.date = date;
    }

    public void display () {
        System.out.println("------------------------------------------------------");
        System.out.println("Passenger : " + passenger.getName() + "( " + passenger.getContact() + " )");
        System.out.println("Flight : " + flight.getFlightNo() +  " - " + flight.getSource() + "->" + flight.getDestination());
        System.out.println("Date : " + date);
        System.out.println("Price : " + flight.getPrice());
        System.out.println("-------------------------------------------------------");
    }
}
