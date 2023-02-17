package com.contact.springbootcontact.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/")
    public List<Contact> hello(){
        return contactService.getContacts();
    }

    @PostMapping("/")
    public void addMessage(@RequestBody Contact contact){
        contactService.addMessage(contact);
    }
}
