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
                    if(passengers.isEmpty()) {
                        System.out.println("First Register Passenger");
                        break;
                    }

                    System.out.println("Registered Passenger");
                    for(Passenger p : passengers) {
                        System.out.println("Passenger ID :" + p.getId() +
                                            "\nPassenger Name :" + p.getName());
                    }

                    System.out.println("Enter the Passenger ID :");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Passenger selectedPassenger = null;
                    for(Passenger p : passengers) {
                        if(id == p.getId()) {
                            selectedPassenger = p;
                            break;
                        }
                    }

                    if(selectedPassenger == null) {
                        System.out.println("Invalid Passenger ID");
                        break;
                    }

                    System.out.println("Available Flight");
                    for(int i = 0 ; i < flights.size() ; i++){
                        System.out.println( (i+1) + ". " + flights.get(i).getFlightNo());
                    }

                    System.out.println("Enter the Flight ID :");
                    int fid = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the Date(dd-mm--yyyy) :");
                    String date = sc.nextLine();

                    bookings.add(new Booking(selectedPassenger , flights.get(fid - 1) , date));
                    System.out.println("Booking Confirmed !! ");

                    break;

                case 4:
                    if(bookings.isEmpty()) {
                        System.out.println("No Bookings Available");
                        break;
                    }

                    for(Booking b : bookings) {
                        b.display();
                    }

                    break;

                case 5:
                    System.out.println("Enter the Source : ");
                    String src = sc.nextLine().toLowerCase();

                    System.out.println("Enter the Destination : ");
                    String dest = sc.nextLine().toLowerCase();

                    boolean found = false;
                    for(Flight f : flights) {
                        if(src.equals(f.getSource().toLowerCase()) && dest.equals(f.getDestination().toLowerCase())) {
                            System.out.println("Flight Number : " + f.getFlightNo() +
                                                "\nSource :" + f.getSource() + "---> Destination" + f.getDestination() +
                                                 "\nPrice : " + f.getPrice());
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("No flights Available !");
                    }

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
