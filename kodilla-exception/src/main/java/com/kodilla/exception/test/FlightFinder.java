package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Lodz", true);
        flights.put("Krakow", false);

        if (flights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Arrival to airport doesn't exist");
        }
        if (flights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Departure to airport doesn't exist");
        }
    }
        public static void main(String[] args){

            FlightFinder flightFinder = new FlightFinder();
            try {
                flightFinder.findFlight(new Flight("Warsaw", "Poznan"));
            } catch (RouteNotFoundException e) {
                System.out.println("Problem with the route: " + e.getMessage());
            } finally {
                System.out.println("Flight search");
            }
        }
    }

