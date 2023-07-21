package Airport1;

public class Flight {
	String id;
	String source;
	String destination;
	double fare;
	int totalSeats;
	int avilableSeats;
	String arrivalTime;
	String departureTime;
	String companyName;
	public Flight() {}
	public Flight(String id, String source, String destination, double fare, int totalSeats, int avilableSeats,
			String arrivalTime, String departureTime, String companyName) {
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalSeats = totalSeats;
		this.avilableSeats = avilableSeats;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.companyName = companyName;
	}
	
}
