package in.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.laptop.User;
import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@GetMapping("/show")
	public String getForm(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@PostMapping("/process")
	public String processForm(Model model,@Valid User user, BindingResult br) {
		if(br.hasErrors()) {
			return "index";
		}
		generateEmail(user);
		model.addAttribute("succ", "Successfull...@");
		return "success";
String str = "Sivaji";
str.length();
	}
	
	private void generateEmail(User user) {
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setTo(user.getEmail());
		smm.setSubject("Registration successfull...@");
		smm.setText("Thanks for our Registration..!");
		javaMailSender.send(smm);
	}

}
