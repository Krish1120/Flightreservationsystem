package com.company;

abstract class Ticket {
    private int pnrNumber;
    private String departureLocation;
    private String destinationLocation;
    private String dateTimeOfDeparture;
    private String dateTimeOfArrival;
    private int seatNumber;
    private double ticketPrice;
    private boolean ticketStatus;
    private Flight flight;
    private Passenger passenger;

    public int getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(int pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getDateTimeOfDeparture() {
        return dateTimeOfDeparture;
    }

    public void setDateTimeOfDeparture(String dateTimeOfDeparture) {
        this.dateTimeOfDeparture = dateTimeOfDeparture;
    }

    public String getDateTimeOfArrival() {
        return dateTimeOfArrival;
    }

    public void setDateTimeOfArrival(String dateTimeOfArrival) {
        this.dateTimeOfArrival = dateTimeOfArrival;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Ticket(int pnrNumber, String departureLocation, String destinationLocation, String dateTimeOfDeparture,
                  String dateTimeOfArrival, int seatNumber, double ticketPrice, boolean ticketStatus, Flight flight, Passenger passenger){
        this.pnrNumber = pnrNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.dateTimeOfDeparture = dateTimeOfDeparture;
        this.dateTimeOfArrival = dateTimeOfArrival;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.ticketStatus = ticketStatus;
        this.flight = flight;
        this.passenger = passenger;
    }

    public void printTicketDetails(){
        System.out.println("PNR: " + getPnrNumber());
        System.out.println("Departure: " + getDepartureLocation());
        System.out.println("Destination: " + getDestinationLocation());
        System.out.println("Departure time: " + getDateTimeOfDeparture());
        System.out.println("Arrival time: " + getDateTimeOfArrival());
        System.out.println("Seat number: " + getSeatNumber());
        System.out.println("Ticket Price: " + getTicketPrice() + "/- Rupees only.");
        System.out.println("Ticket Confirmation: " + isTicketStatus());
        System.out.println("Flight Details: " + getFlight().getFlightDetails());
        System.out.println("Passenger Details: " + getPassenger().getContactDetails() + ", " + getPassenger().getAddressDetails());
    }
}
