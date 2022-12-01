package com.crmapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailServiceImpl implements EmailService {
	@Autowired
	JavaMailSender mailer;
	@Override
	public void emailer(String to, String subject, String message) {
		SimpleMailMessage mes= new SimpleMailMessage();
		mes.setTo(to);
		mes.setSubject(subject);
		mes.setText(message);
		mailer.send(mes);
	}

}
