package ca.sheridancollege.johnavro.requestController;


import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.johnavro.beans.Appointments;

//import ca.sheridancollege.johnavro.beans.Appointments;
@Controller
public class HomeController {


@GetMapping("/")
 public String index(Model model) {
	return "index";
 }
 @PostMapping("/formPost")
 public String formPost(@RequestParam String firstName, 
		@RequestParam String email, 
		@RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate date,
		@RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.TIME) LocalTime time) {
		Appointments appointment = new Appointments();
		appointment.setFirstName(firstName);
		appointment.setEmail(email);
		appointment.setdate(date);
		appointment.settime(time);
		System.out.println(appointment.toString());
	return "working";
 }
}