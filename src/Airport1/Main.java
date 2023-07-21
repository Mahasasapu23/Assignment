package Airport1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Flight flight=new Flight("a101","hyd","vzm",5000.5,20,10,"10:00","10:15","decan");
		Traveller traveller = new  Traveller("maha",63000.5,"maha@.com","m101",LocalDate.now());
		Airport a = new Airport();
		System.out.println(a.addFlight(flight));
		System.out.println(a.searchFlightsBySourceAndDestination("hyd","vzm"));

	}

}
