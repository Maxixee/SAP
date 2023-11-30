package br.com.ifba;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author Jonas Dias
 */
@SpringBootApplication
@ComponentScan(basePackages = "br.com.ifba")
@EntityScan(basePackages = {"br.com.ifba"})
@EnableJpaRepositories(basePackages = {"br.com.ifba"})
public class SapApplication {
    public static void main(String[] args) {     
        ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(SapApplication.class).headless(false).run(args);
        
        TelaDeTestes telaDeTestes =  context.getBean(TelaDeTestes.class);
        telaDeTestes.setVisible(true);       
    }
}

