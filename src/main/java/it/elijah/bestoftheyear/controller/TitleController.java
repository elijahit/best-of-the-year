package it.elijah.bestoftheyear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TitleController {
	
	@GetMapping("/best")
	public String bestPage(@RequestParam(name = "name") String nome, Model model) {

		model.addAttribute("name", nome);

		return "bestPage";
	}

}
