package com.crmapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entities.Contact;
import com.crmapp.repository.ContactRepository;
@Service
public class ContactsServiceImpl implements ContactsService {
	@Autowired
	private ContactRepository repoo;
	@Override
	public void saveOneRecord(Contact contacts) {
		repoo.save(contacts);
	}
	@Override
	public List<Contact> allLeads() {
		List<Contact> findAll = repoo.findAll();
		return findAll;
		
	}
	@Override
	public Contact getRecord(long id) {
		Optional<Contact> findById = repoo.findById(id);
		Contact contacts = findById.get();
		return contacts;
	}

}
