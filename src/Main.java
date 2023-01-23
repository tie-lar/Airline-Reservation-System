/********************************************
 Airline Reservation System
 User:
 - Can register
 - Can login
 - Can create reservations for available flights
 - Can cancel existing reservations

 Worker
 - Can update flight availability details
 - Can register
 - Can login
 - Can delete a user's reservation



********************************************/


public class Main {
    public static void main(String[] args) {
    //User newUser = new User();
    //newUser.setName("Michelle");
    //newUser.checkAvailFlights();

        Provider prov = new Provider();
        prov.setAvailFlights();
    }
}