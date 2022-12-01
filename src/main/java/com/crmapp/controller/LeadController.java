package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entities.Contact;
import com.crmapp.entities.Lead;
import com.crmapp.services.ContactsService;
import com.crmapp.services.LeadService;

@Controller
public class LeadController {
	@Autowired
	LeadService service;
	@Autowired
	ContactsService contactService;
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String createLead() {
		return "create_lead";
}
	@RequestMapping(value = "/saveLead",method = RequestMethod.POST)
	public String saveRecord(@ModelAttribute("lead") Lead lead,Model model) {
		service.saveOneRecord(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	//http://localhost:8080/listLeads
	@RequestMapping("/listLeads")
	public String listAllLeads(Model model) {
		List<Lead> leads = service.allLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
	}
	@RequestMapping("/leadInform")
	public String leadInform(@RequestParam("id") long id,Model model) {
		Lead lead = service.getRecord(id);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,Model model) {
		Lead lead = service.getRecord(id);
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveOneRecord(contact);
		
		service.deleteRecord(id);
		List<Contact> leads = contactService.allLeads();
		model.addAttribute("leads",leads);
		return "list_contact";
	}
	
	@RequestMapping("/listContacts")
	public String listContacts(Model model) {
		List<Contact> leads = contactService.allLeads();
		model.addAttribute("leads",leads);
		return "list_contact";
		
	}
	
	
	
	
}