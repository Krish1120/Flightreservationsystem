package com.company;

import java.util.Scanner;

public class TouristTicket extends Ticket {
    private String hotelName;
    private int noOfLocations;
    private String touristLocation;
    private Address hotelAddress;

    public String getHotelName() {
        return hotelName;
    }

    public String getTouristLocation() {
        return touristLocation;
    }

    public void setHotelAddress(Address hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public Address getHotelAddress() {
        return hotelAddress;
    }

    public String displayHotelDetails(){
        String hotelDetails = getHotelName() + ", " + getTouristLocation() + ", " + getHotelAddress();
        return hotelDetails;
    }
    public void addTouristLocation(){
        if(noOfLocations<5){
            System.out.println("Please select the tourist location you wish to add to your trip: ");
        }
        else{
            System.out.println("Oops! You have already selected maximum number of tourist locations.");
            System.out.println("Please remove one of the added tourist location, if you wish to add a new tourist location");
        }
    }
    public void removeTouristLocation(){
        if(noOfLocations == 0){
            System.out.println("There are no tourist locations added.");
            System.out.println("Please add a tourist location first.");
        }
        else{
            System.out.println("Select the tourist location you wish to remove.");
        }
    }

    public TouristTicket(int pnrNumber, String departureLocation, String destinationLocation, String dateTimeOfDeparture,
                         String dateTimeOfArrival, int seatNumber, double ticketPrice,boolean ticketStatus, Flight flight, Passenger passenger){
        super(pnrNumber, departureLocation, destinationLocation, dateTimeOfDeparture, dateTimeOfArrival, seatNumber, ticketPrice, ticketStatus, flight, passenger);
    }
}
