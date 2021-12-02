package com.company;

import java.util.Scanner;

public class Passenger {
    private static int idCounter;
    private int passengerId;
    private Address address;
    private Contact contact;

    private static class Address {
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
    }

    private static class Contact {
        private String name;
        private String number;
        private String email;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Contact(String name, String number, String email){
            this.name = name;
            this.number = number;
            this.email = email;
        }
    }

    static {
        idCounter = 0;
    }

    public Passenger(String addressStreet, String addressCity, String addressState, String contactName,
                     String contactNumber, String contactEmail){
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactNumber, contactEmail);
        this.passengerId = idCounter++;
    }

    public static int getPassengerCount(){
        return idCounter;
    }

    public String getAddressDetails(){
        return "Street: " + address.street + ", " + "City: " + address.city + ", " + "State: " + address.state;
    }

    public void updateAddressDetails(){
        System.out.println("Enter New Street Details:");
        Scanner sc = new Scanner(System.in);
        address.street = sc.nextLine();

        System.out.println("Enter New city Details: ");
        address.city = sc.nextLine();

        System.out.println("Enter New State Details: ");
        address.state = sc.nextLine();
    }

    public String getContactDetails(){
        return "Name: " + contact.name + ", " + "Phone: " +  contact.number + ", " + "Email: " + contact.email;
    }

    public void updateContactDetails(){
        System.out.println("Enter new contact name: ");
        Scanner sc = new Scanner(System.in);
        contact.name = sc.nextLine();

        System.out.println("Enter new contact number: ");
        contact.number = sc.nextLine();

        System.out.println("Enter new contact email");
        contact.email = sc.nextLine();
    }

}
