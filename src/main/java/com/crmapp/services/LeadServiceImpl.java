package com.crmapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entities.Lead;
import com.crmapp.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository repoo;
	@Override
	public void saveOneRecord(Lead lead) {
		repoo.save(lead);
	}
	@Override
	public List<Lead> allLeads() {
		List<Lead> findAll = repoo.findAll();
		return findAll;
		
	}
	@Override
	public Lead getRecord(long id) {
		Optional<Lead> findById = repoo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteRecord(long id) {
		repoo.deleteById(id);
	}

}
