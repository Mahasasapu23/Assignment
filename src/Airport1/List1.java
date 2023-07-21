package Airport1;
import java.time.LocalDate;
import java.util.ArrayList;
public class List1 {
	public static void main(String[] args) {
		
	ArrayList<Flight> flights = new ArrayList<Flight>();
	 flights.add(new Flight("a101","hyd","vzm",5000.5,20,10,"10:00","10:15","decan"));
	 flights.add(new Flight("i101","hyd","delhi",5000.57,30,6,"10:00","10:15","decan"));
	 flights.add(new Flight("m101","hyd","vizag",5000.56,40,5,"10:00","10:15","decan"));
	 
	 ArrayList<Traveller> travellers = new ArrayList<Traveller>();
	 travellers.add(new Traveller("maha",63000.5,"maha@.com","m101",LocalDate.now()));
	 travellers.add(new Traveller("anirudh",63000.56,"maha@.com","m101",LocalDate.now()));
	 travellers.add(new Traveller("isha",63000.58,"maha@.com","m101",LocalDate.now()));
}
}