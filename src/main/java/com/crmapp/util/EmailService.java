package com.crmapp.util;

import org.springframework.stereotype.Service;

@Service

public interface EmailService {
	public void emailer(String to,String subject,String message);
}
