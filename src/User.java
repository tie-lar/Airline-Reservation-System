import java.util.Scanner;

/***********************************************************************
 NECESSARY UPDATES:
 - Make reservations and update available flights for provider relating
  to reserved flights from user
 - 
 **********************************************************************/

public class User {
    protected
    String name;
    String email;
    String password;
    int phoneNumber;


    // Mutator and Accessor methods
    public
    void setName() {
        //Create a scanner object and store user inout into 'userName' the assign that to this.name
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        this.name = String.valueOf(userName);
    }

    void setEmail() {
        Scanner myObj = new Scanner(System.in);
        String emailAddress = myObj.nextLine();
        this.email = String.valueOf(emailAddress);
    }

    void setPassword() {
        Scanner myObj = new Scanner(System.in);
        String emailAddress = myObj.nextLine();
        this.password = String.valueOf(password);
    }

    void setPhoneNumber() {
        Scanner myObj = new Scanner(System.in);
        this.phoneNumber = Integer.parseInt(myObj.nextLine());
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    String getPassword() {
        return password;
    }

    int getPhoneNumber() {
        return phoneNumber;
    }


    void register()
    {


        while (true) {
            Scanner reg = new Scanner(System.in);
            System.out.println("Would you like to register for an account?\n" +
                    "Type Y for Yes | Type N for No: ");

            String regYesorNo = reg.next();

            if (regYesorNo.equals("Y") || regYesorNo.equals("y")) {
                System.out.println("What is your full name?");
                setName();

                System.out.println("What is your email address?");
                setEmail();

                System.out.println("What is your phone number?");
                setPhoneNumber();

                System.out.println("Please set a password.");
                setPassword();

                System.out.println("Thank you. You have successfully registered.");
                menu();
            } else if (regYesorNo.equals("N") || regYesorNo.equals("n")) {
                System.out.println("Returning back to main menu...");
                menu();
            } else {
                System.out.println("Invalid input, please type either a Y for Yes or N for no.");
            }
        }

    }

    String login()
    {
        return "Would you like to login?";
    }


    void menu()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to TylerAirlines!\n" +
                "MAIN MENU\n" +
                "**************************************************\n" +
                "Register - Type R to navigate to the register menu\n" +
                "**************************************************\n" +
                "Login    - Type L to navigate to the Login menu\n" +
                "**************************************************") ;
        String userInput = myObj.next();

        if (userInput.equals("R"))
        {
            register();
        }
        else if (userInput.equals("L"))
        {
            login();
        }
    }

    void checkAvailFlights()
    {
        //New instance of provider so user can access flight information
        Provider newUser = new Provider();
        newUser.getAvailFlights();
    }

    void makeReservation()
    {
        //
    }





}
