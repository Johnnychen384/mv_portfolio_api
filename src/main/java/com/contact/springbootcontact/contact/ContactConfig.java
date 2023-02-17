package com.contact.springbootcontact.contact;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactConfig {

    @Bean
    CommandLineRunner commandLineRunner(ContactRepository repository) {
        return args -> {
            new Contact(

                    "Johnny",
                    "asd@asd",
                    "asd",
                    "Hi"
            );
        };
    }
}
