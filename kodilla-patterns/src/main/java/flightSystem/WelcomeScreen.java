package flightSystem;

public class WelcomeScreen {
    public void welcomeScreen() {
        AvailableConnections availableConnections = new AvailableConnections();
        System.out.println("Welcome in Flight System \n");
        System.out.println("List of available flights: \n");
        System.out.println(availableConnections.getListOfFlights());
    }
}


