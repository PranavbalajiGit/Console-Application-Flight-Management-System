package com.flightbookingsystem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightBookingApp {
    Scanner sc = new Scanner(System.in);
    Admin admin = new Admin("Pranav");

    List<Passenger> passenger = new ArrayList<>();
    List<Flight> flight = new ArrayList<>();
    List<Booking> bookings = new ArrayList<>();

    while(true) {
        admin.showMenu();
        System.out.println("Enter your Choice : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            default:
                System.out.println("Invalid Choice . . .");
        }
    }
}
