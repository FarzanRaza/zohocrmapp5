package com.crmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.services.LeadService;
import com.crmapp.util.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService service;
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email,Model model) {
		model.addAttribute("email",email);
		return "compose";
		
	}
	@RequestMapping(value = "/emailer",method = RequestMethod.POST)
	public String emailer(@RequestParam("to") String to,@RequestParam("subject") String subject,@RequestParam("message") String message,Model model) {
		service.emailer(to, subject, message);
		model.addAttribute("msg","mail sent");
		return "compose";
		
	}
}
