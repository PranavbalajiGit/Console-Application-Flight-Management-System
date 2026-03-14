package com.flightbookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightBookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin("Pranav");

        List<Passenger> passengers = new ArrayList<>();
        List<Flight> flights = new ArrayList<>();
        List<Booking> bookings = new ArrayList<>();

        flights.add(new Flight("AI101" , "Chennai" , "Delhi" , 3500));
        flights.add(new Flight("EK505" , "Mumbai" , "Dubai" , 8500));
        flights.add(new Flight("ING202" , "Pune" , "Kolkata" , 4500));

        int passengerId = 1;

        while(true) {
            admin.showMenu();
            System.out.println("Enter your Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Registering an Passenger !! ");

                    System.out.print("Enter the Name : ");
                    String pName = sc.nextLine();

                    System.out.print("Enter the Contact : ");
                    String pContact = sc.nextLine();

                    passengers.add(new Passenger(passengerId++ , pName , pContact));
                    System.out.println("Passenger Registered !!!");

                    System.out.println();
                    break;

                case 2:
                    System.out.println("Available Flights");
                    for(Flight f : flights) {
                        System.out.println("Flight Number : " + f.getFlightNo() +
                                "\nSource : " + f.getSource() + "---> Destination : " + f.getDestination()
                                            + "\nRs. Price : " + f.getPrice());
                    }
                    break;

                case 3:

                    break;

                case 4:
                    break;

                case 5:

                    break;

                case 6:
                    System.out.println("Exiting the System . . .");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice . . .");
            }
        }
    }
}
