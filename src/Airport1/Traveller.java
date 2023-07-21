package Airport1;
import java.time.LocalDate;
public class Traveller {
	String name;
	double mobile;
	String email;
	String flightId;
	LocalDate date;
	public Traveller() {}
	public Traveller(String name, double mobile, String email, String flightId, LocalDate date) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.flightId = flightId;
		this.date = date;
	}
}
