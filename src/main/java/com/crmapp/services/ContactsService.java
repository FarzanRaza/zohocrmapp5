package com.crmapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crmapp.entities.Contact;
import com.crmapp.entities.Lead;

@Service
public interface ContactsService {
	
	public void saveOneRecord(Contact contacts);

	public List<Contact> allLeads();

	public Contact getRecord(long id);


}
