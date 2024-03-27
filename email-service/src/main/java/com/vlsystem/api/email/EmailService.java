package com.vlsystem.api.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private final JavaMailSender mailSender;


	public EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public boolean sendMail(Email email) {
		try {
		var message = new SimpleMailMessage();
		message.setFrom("vlsystem@outlook.com");
		message.setTo(email.to());
		message.setSubject(email.subject());
		message.setText(email.body());
		mailSender.send(message);
		 return true; // Envio de e-mail bem-sucedido
	    } catch (Exception e) {
	        // Log ou tratamento de erro aqui
	        return false; // Falha no envio de e-mail
	    }
	}




}
