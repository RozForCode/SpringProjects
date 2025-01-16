package ca.sheridancollege.johnnavro.Controllers;

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
	@GetMapping("/style")
	public String style(Model model) {// IMPORTATN: careful with import only import spring framework package
		return "style";
	}
}
