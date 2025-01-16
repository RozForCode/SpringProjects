package ca.sheridancollege.johnavro.requestPackage;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.johnavro.beans.Message;
import ca.sheridancollege.johnavro.beans.Student;

@Controller
public class HomeController {

//	@Autowired
//	private Message message;
//	this is reflection
//	@GetMapping("/")
//	public String index(Model model) {
//		System.out.println(message);
//		return "index";
//	}
	
	// setter injection
//	private Message message;
//	@Autowired
//	public void setMessage(Message message) {
//		this.message = message;
//	}
//	@GetMapping("/")
//	public String index(Model model) {
//		System.out.println(model.addAttribute("message",message.getSayThis()));
//		return "index";
//	}
	
	
	//CONTRUCTOR INJECTION 
	// WE CAN DO INJECTION WITH FINAL KEYWORD AND INJECTION TOO
	// auto wired not required and no return type for constructor
	private final Message message;
	@Autowired
	public HomeController(Message message) {
		this.message = message;
	}
	@GetMapping("/")
	public String index(Model model) {
		System.out.println(model.addAttribute("message",message.getSayThis()));
		return "index";
	}
	
	
	
	@PostMapping("/formPost")
	public String formPost(@RequestParam String firstName, @RequestParam String lastName, 
			@RequestParam int studentNumber, @RequestParam String email, @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate birthday) {
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setEmail(email);
		student.setStudentNumber(studentNumber);
		student.setBirthday(birthday);
		System.out.println(student.toString());
		return "working";
	}
}
