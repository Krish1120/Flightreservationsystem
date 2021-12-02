package com.company;

public class RegularTicket extends Ticket {
    private boolean food = false;
    private boolean water = false;
    private boolean snacks = false;

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isSnacks() {
        return snacks;
    }

    public void setSnacks(boolean snacks) {
        this.snacks = snacks;
    }

    public void selectSpecialServices(){
        System.out.println("Please select the special services you wish to avail onboard of Flight.");
        System.out.println("1.Food");
        System.out.println("2.Water");
        System.out.println("3.Snacks");
    }
    public void checkSpecialServicesAvailed(){
        if(food == true || water == true || snacks == true) {

            if (food == true) {
                System.out.println("Food = Yes!");
            }
            else{
                System.out.println("Food = No.");
            }
            if (water == true) {
                System.out.println("Water = Yes!");
            }
            else{
                System.out.println("Water = No.");
            }
            if (snacks == true) {
                System.out.println("Snacks = Yes!");
            }
            else{
                System.out.println("Snacks = No.");
            }
        }
        else{
            System.out.println("No Special services Availed.");
        }
    }

    public void updateSpecialServicesAvailed(boolean food, boolean water, boolean snacks){
        this.food = food;
        this.water = water;
        this.snacks = snacks;
    }



    public RegularTicket(int pnrNumber, String departureLocation, String destinationLocation, String dateTimeOfDeparture,
                         String dateTimeOfArrival, int seatNumber, double ticketPrice,boolean ticketStatus, Flight flight, Passenger passenger){
        super(pnrNumber, departureLocation, destinationLocation, dateTimeOfDeparture, dateTimeOfArrival, seatNumber, ticketPrice, ticketStatus, flight, passenger);
    }

}
