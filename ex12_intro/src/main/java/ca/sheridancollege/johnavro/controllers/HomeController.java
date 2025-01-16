package ca.sheridancollege.johnavro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	// annotation to map the request coming from http
	@GetMapping("/")
	public String index(Model model) {// IMPORTATN: careful with import only import spring framework package
		return "index";
	}
	@GetMapping("/hair")
	public String hair(Model model) {
		return "hair";
	}
	@GetMapping("/height")
	public String height(Model model) {
		return "height";
	}
	@GetMapping("/name")
	public String name(Model model) {
		return "name";
	}
}