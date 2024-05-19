package ar.edu.unju.fi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formCliantesControler {
	@GetMapping("/formularios")
	public String getformCliantes() {
		return "formCliantes";
	}
}
