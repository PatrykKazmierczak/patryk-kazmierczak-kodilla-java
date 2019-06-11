package flightSystem;

import java.util.HashSet;
import java.util.Set;

public class AvailableConnections {
    private Set<Flight> listOfFlights = new HashSet<> ();

    Flight WAWA_GDA = new Flight("WAWA_GDA", "Warszawa","Gdańsk","9:00","11:00");
    Flight LCJ_WAWA = new Flight("LCJ_WAWA", "Łódź","Warszawa","11:30","13:30");
    Flight WAWA_LCJ = new Flight("WAWA_LCJ", "Warszawa","Łódź","8:00","10:00");
    Flight WAWA_KRK = new Flight("WAWA_KRK", "Warszawa","Kraków","14:00","16:00");
    Flight WRO_WAWA = new Flight ("WRO_WAWA", "Wrocław", "Warszawa", "15:45", "17:45");
    Flight WAWA_WRO = new Flight("WAWA_WRO", "Warszawa","Wrocław","16:00","18:30");
    Flight KRK_WRO = new Flight ("KRK_WRO", "Kraków", "Wrocław", "15:20", "17:45");
    Flight LCJ_WRO = new Flight ("LCJ_WRO", "Łódź", "Wrocław", "17:00", "19:00");
    Flight KRK_GDA = new Flight ("KRK_GDA", "Kraków", "Gdańsk", "15:20", "17:45");


    public Set<Flight> getListOfFlights() {
        listOfFlights.add (WAWA_GDA);
        listOfFlights.add (LCJ_WAWA);
        listOfFlights.add (WAWA_LCJ);
        listOfFlights.add (WAWA_KRK);
        listOfFlights.add (WAWA_WRO);
        listOfFlights.add (WRO_WAWA);
        listOfFlights.add (KRK_WRO);
        listOfFlights.add (LCJ_WRO);
        listOfFlights.add (KRK_GDA);

        return listOfFlights;
    }
}
