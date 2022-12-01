package com.crmapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entities.Billing;
import com.crmapp.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository repository;
	@Override
	public void generateBill(Billing billing) {
		repository.save(billing);
	}

}
