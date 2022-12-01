package com.crmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entities.Billing;
import com.crmapp.entities.Contact;
import com.crmapp.services.BillingService;
import com.crmapp.services.ContactsService;

@Controller
public class BillingController {
	@Autowired
	private BillingService serviceBill;
	@Autowired
	private ContactsService serviceContact;
	@RequestMapping("/billform")
	public String invoiceGenerated(@RequestParam("id") long id,Model model) {
		Contact record = serviceContact.getRecord(id);
		model.addAttribute("record", record);
		return "invoice_generation";
		
	}
	@RequestMapping(value = "/billInvoice",method = RequestMethod.POST)
	public String billInvoice(@ModelAttribute Billing billing) {
		serviceBill.generateBill(billing);
		return "invoice_generation";
		
	}
}
