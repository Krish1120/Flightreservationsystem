package com.company;

import java.util.Scanner;

public class Address {
    private String street;
    private String city;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getAddressDetails(){
        String addressDetails = "Street: " + getStreet() + ", " + "City: " + getCity() + ", " + "State: " + getState();
        return addressDetails;
    }

    public void updateAddressDetails(){
        System.out.println("Enter New Street Details:");
        Scanner sc = new Scanner(System.in);
        setStreet(sc.nextLine());

        System.out.println("Enter New city Details: ");
        setCity(sc.nextLine());

        System.out.println("Enter New State Details: ");
        setState(sc.nextLine());
    }

}
