package flightSystem;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsSearch {
    AvailableConnections availableConnections = new AvailableConnections ();

    public void flightsSearch(){

        Set<Flight> departureCity = availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity() == "Warszawa")
                .collect(Collectors.toSet());

        Set<Flight> middleCity = availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity() == "Wrocław")
                .collect(Collectors.toSet());

        System.out.println("Flights from Warszawa to Wrocław: ");
        Iterator<Flight> iterDepCity = departureCity.iterator();
        while (iterDepCity.hasNext()) {
            Flight midFlight = iterDepCity.next();
            if (midFlight.getArrivalCity () == "Wrocław")
                System.out.println(midFlight);
        }
        System.out.println("Flights from Wrocław to Warszawa: ");
        Iterator<Flight> iterMidCity = middleCity.iterator();
        while (iterMidCity.hasNext()) {
            Flight midFlight = iterMidCity.next();
            if (midFlight.getArrivalCity () == "Warszawa")
                System.out.println(midFlight);
        }
    }
    public void findFlightFrom(String city){
        System.out.println("Flights from: " + city);
        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity () == "Kraków")
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));
    }

    public void findFlightsTo(String city){
        System.out.println("Flights to: " + city);
        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getArrivalCity () == "Łódź")
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));
    }
}
