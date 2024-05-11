package ar.edu.unju.fi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControler {
	@GetMapping("/Index")
	public String getIndex() {
		return "Index";
	}
}
