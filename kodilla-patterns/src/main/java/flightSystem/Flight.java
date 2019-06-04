package flightSystem;

public class Flight {
    private String flightName;
    private String departureCity;
    private String arrivalCity;
    private String timeOfDeparture;
    private String timeOfArrival;

    public Flight(String flightName, String departureCity, String arrivalCity, String timeOfDeparture, String timeOfArrival) {
        this.flightName = flightName;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    @Override
    public String toString() {
        return "Flight Code: " + getFlightName() + " | " + " Departure: " + getDepartureCity() + " | " + " Arrival: " + getArrivalCity () + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return flight.equals(flight.flightName);
    }
}
