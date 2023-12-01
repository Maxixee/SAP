package br.com.ifba.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.ifba.email.model.EmailDto;

@Service
public class EmailService {
	@Autowired 
	private final JavaMailSender emailSend;
	
    public EmailService(JavaMailSender emailSend) {
        this.emailSend = emailSend;
    }

	public void sendEmail(EmailDto emailDto) {
		SimpleMailMessage email = new SimpleMailMessage();
		email.setFrom(emailDto.getFrom());
		email.setTo(emailDto.getTo());
		email.setSubject(emailDto.getTitle());
		email.setText(emailDto.getText());
		emailSend.send(email);
	}

}
