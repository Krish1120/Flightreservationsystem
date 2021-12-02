package com.company;

public class Main {


    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Bridge Street","Hyderabad", "Telangana",
                "Sai Krishna", "9218174741","saikrishna@gmail.com");
        Passenger passenger2 = new Passenger("Basheerbagh", "Delhi","New Delhi",
                "Ashok","8736452714","ashok@gmail.com");

        Flight flight1 = new Flight("BA2491A","IndiGo", 100,58);
        Flight flight2 = new Flight("XC84673H", "Emirates", 100,80);

        RegularTicket regularTicket1 = new RegularTicket(288494,"India","London",
                "27/11/2021 04:00 AM","28/11/2021 10:00 PM",101,2478,true,flight1,passenger1);

        TouristTicket touristTicket1 = new TouristTicket(378834,"India","Paris",
                "27/11/2021 08:00 AM","28/11/2021 3:00 PM",043,5076,true,flight2,passenger2);


        System.out.println("------Regular ticket Details------");
        regularTicket1.printTicketDetails();
        System.out.println("------Tourist ticket Details------");
        touristTicket1.printTicketDetails();


    }
}
