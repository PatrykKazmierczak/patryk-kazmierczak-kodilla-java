package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> possibleFlights = new HashMap<>();
        possibleFlights.put("Warsaw", true);
        possibleFlights.put("Chicago", true);
        possibleFlights.put("New York", true);
        possibleFlights.put("Tokyo", false);
        possibleFlights.put("Sydney", false);

        if (possibleFlights.containsKey(flight.getArrivalAirport()) && possibleFlights.containsValue(true)) {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is available");

        } else if (possibleFlights.containsKey(flight.getArrivalAirport()) && possibleFlights.containsValue(false)) {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is temporarily unavailable");
        }
        throw new RouteNotFoundException("Flight to this airport is not available");
    }

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight WAW_HND = new Flight("Warsaw", "Tokyo");
        try {
            flightFinder.findFlight(WAW_HND);

        } catch (RouteNotFoundException e) {
            System.out.println("We are so sorry, flight to this airport is not possible");
        }
    }
}



