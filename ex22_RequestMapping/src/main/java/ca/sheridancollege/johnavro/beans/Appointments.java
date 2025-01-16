package ca.sheridancollege.johnavro.beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointments {
	private String firstName;
	private String email;
	private LocalDate date;
	private LocalTime time;
	
	
	@Override
	public String toString() {
		return "Appointments [firstName=" + firstName + ", email=" + email + ", date=" + date
				+ ", time=" + time + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getdate() {
		return date;
	}
	public void setdate(LocalDate date) {
		this.date = date;
	}
	public LocalTime gettime() {
		return time;
	}
	public void settime(LocalTime time) {
		this.time = time;
	}
}
