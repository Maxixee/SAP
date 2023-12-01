package br.com.ifba.email.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class EmailDto {
	
	private String from;

	@NotBlank
	@Email
	private String to;
	
	@NotBlank
	private String title;
	
	@NotBlank
	private String text;
	
	
}
