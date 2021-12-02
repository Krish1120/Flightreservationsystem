package com.company;

public class Flight {
    private String flightNumber;
    private String flightAirline;
    private int flightCapacity;
    private int seatsBooked;

    public Flight(String flightNumber, String flightAirline, int flightCapacity, int seatsBooked) {
        this.flightNumber = flightNumber;
        this.flightAirline = flightAirline;
        this.flightCapacity = flightCapacity;
        this.seatsBooked = seatsBooked;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightAirline() {
        return flightAirline;
    }

    public int getFlightCapacity() {
        return flightCapacity;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public String getFlightDetails(){
        String flightDetails = "Flight Number: " + getFlightNumber() + ", "
                + "Flight Airline: " +  getFlightAirline() + ", "
                + "Flight Capacity: " +  getFlightCapacity() + ", "
                + "No. Of Seats Booked: " + getSeatsBooked();
        return flightDetails;
    }

    public void checkSeatsAvailability(){
        if(seatsBooked<getFlightCapacity()){
            System.out.println("Seats Available: " + (getFlightCapacity()-seatsBooked));
        }
        else{
            System.out.println("No Seats available on this flight.");
            System.out.println("Don't worry! Try to book seats earlier next time.");
        }

    }

}
