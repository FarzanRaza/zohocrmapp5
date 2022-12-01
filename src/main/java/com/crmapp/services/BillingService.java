package com.crmapp.services;

import org.springframework.stereotype.Service;

import com.crmapp.entities.Billing;

@Service

public interface BillingService {
	public void generateBill(Billing billing);
}
