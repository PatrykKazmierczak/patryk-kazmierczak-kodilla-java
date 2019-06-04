package flightSystem;

public class FlightSystemMain {
    public static void main(String[] args) {
        FlightsSearch flightsSearch = new FlightsSearch ();
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        welcomeScreen.welcomeScreen();

        flightsSearch.flightsSearch ();
        flightsSearch.findFlightFrom("Kraków");
        System.out.println ();
        flightsSearch.findFlightsTo("Łódź");

    }
}
