package Airport1;
import java.util.ArrayList;
class Airport {
	Address[] address;
	ArrayList<Flight> flights;
	ArrayList<Traveller> travellers;

public Airport() {}

public Airport(Address[] address) {
	this.address = address;
	this.flights = new ArrayList<>();
	this.travellers = new ArrayList<>();
}

public boolean addFlight(Flight flight) {
	if (flight != null) {
	flights.add(flight);
	return true;
	}
return false;
}

public ArrayList searchFlightsBySourceAndDestination(String source, String destination) {
	ArrayList matchingFlights = new ArrayList<>();
	for (Flight flight : flights) {
		if (flight.source.equals(source) && flight.destination.equals(destination)) {
			matchingFlights.add(flight);
		}
}
return matchingFlights;
}

public void bookTicket(String flightId, Traveller traveller) {
	for (Flight flight : flights) {
		if (flight.id.equals(flightId) && flight.avilableSeats > 0) {
			flight.avilableSeats--;
			travellers.add(traveller);
			break;
		}
    }
 }
}
