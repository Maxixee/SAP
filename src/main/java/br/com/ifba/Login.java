/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Hiego
 */
@SpringBootApplication
public class Login {
    public static void main(String[] args) {     
        ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(Login.class).headless(false).run(args);
        
        
        TelaLogin login =  context.getBean(TelaLogin.class);
        login.setVisible(true);       
    }

}
