package flightSystem;

import java.util.stream.Collectors;

public class FlightsSearch {
    AvailableConnections availableConnections = new AvailableConnections ();


    public void findFlightFrom(String city){
        System.out.println("Flights from: " + city);
        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity ().equals (city))
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));
    }

    public void findFlightsTo(String city){
        System.out.println("Flights to: " + city);
        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getArrivalCity ().equals (city))
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));
    }
    public void findFlightsVia(String from, String via, String to){
        System.out.println ("Flights from: "+ from + " via " + via + " to " + to);
        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity ().equals (from))
                .filter(listOfFlights -> listOfFlights.getArrivalCity ().equals (via))
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));
        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity ().equals (via))
                .filter(listOfFlights -> listOfFlights.getArrivalCity ().equals (to))
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));
    }
}
