package com.company;

import java.util.Scanner;

public class Contact {
    private String contactName;
    private String contactNumber;
    private String contactEmail;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Contact(String contactName, String contactNumber, String contactEmail){
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
    }

    public String getContactDetails(){
        String contactDetails = "Name: " + getContactName() + ", " + "Phone: " +  getContactNumber() + ", " + "Email: " + getContactEmail();
        return contactDetails;
    }

    public void updateContactDetails(){
        System.out.println("Enter new contact name: ");
        Scanner sc = new Scanner(System.in);
        setContactName(sc.nextLine());

        System.out.println("Enter new contact number: ");
        setContactNumber(sc.nextLine());

        System.out.println("Enter new contact email");
        setContactEmail(sc.nextLine());
    }

}
