import java.util.*;

/***********************************************************************
 NECESSARY UPDATES:
 - Change availFlights into a list or array so Provider can remove avail flights
  so, AVAILF1 = The first row for available flight, and have a method or something
  that can .remove(AVAILF1) where AVAILF1 = "London (HEATHROW) to Granada (GRX)                 25/04/2023             75GBP           \n"
 - Be able to delete reservations that user has made if a certain requirement hasn't been made ie. not paid within 24 hrs?
 **********************************************************************/

public class Provider extends User
{

    //List<String> availFlights = new ArrayList<>();
    String availFlights;

    public
    void setAvailFlights() {

        //availFlights = Collections.singletonList(myObj.next());

        int count = 0;
        Scanner myObj = new Scanner(System.in).useDelimiter("\n");
        System.out.println("When inputting the flight information please make sure to use the following template format:\n" +
                "Country (AIRPORT) to Country (AIRPORT)                     00/00/000                       0GBP\n");
        System.out.println("How many available flights would you like to add?");
        int numOfAvailFlights = myObj.nextInt();

        while (true)
        {
            System.out.println("Enter the origin country to the destination country:\n");
            String destination = myObj.next();

            System.out.println("Enter the date of the flight:\n");
            String date = myObj.next();

            System.out.println("Enter the price of the flight:\n");
            String price = myObj.next();

            String flightOne = String.format("%s                  " + "%s             " + "%s\n"                     , destination, date, price);

            this.availFlights =
                    "Available Flights\n" +
                            "Destination                                    |       Date       |       Price\n" +
                            "London (HEATHROW) to Granada (GRX)                 25/04/2023             75GBP           \n" +
                            "London (LUTON) to Portugal (LIS)                   15/06/2023             105GBP          \n" +
                            "Manchester (MAN) to Ireland (DUB)                  30/08/2023             55GBP           \n" + flightOne;

            System.out.println(availFlights);
            count++;

            if (count == numOfAvailFlights)
            {
                System.out.println("Finished inputting flight information.\n" +
                        "Returning back to main menu...");
                break;
            }
        }




    }

    void getAvailFlights()
    {
        System.out.println(availFlights);
    }
}
