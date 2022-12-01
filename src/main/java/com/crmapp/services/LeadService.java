package com.crmapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crmapp.entities.Lead;

@Service
public interface LeadService {
	
	public void saveOneRecord(Lead lead);

	public List<Lead> allLeads();

	public Lead getRecord(long id);

	public void deleteRecord(long id);

}
