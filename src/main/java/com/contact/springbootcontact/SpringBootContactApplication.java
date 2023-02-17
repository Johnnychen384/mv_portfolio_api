package com.contact.springbootcontact;

import com.contact.springbootcontact.contact.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class SpringBootContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootContactApplication.class, args);
	}

}
