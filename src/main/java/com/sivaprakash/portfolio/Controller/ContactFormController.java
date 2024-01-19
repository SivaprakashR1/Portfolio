package com.sivaprakash.portfolio.Controller;

import com.sivaprakash.portfolio.DTO.ContactFormDTO;
import com.sivaprakash.portfolio.Entity.ContactForm;
import com.sivaprakash.portfolio.Service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ContactFormController {
    public ContactFormService contactFormService;

    @Autowired
    public ContactFormController(ContactFormService contactFormService) {
        this.contactFormService = contactFormService;
    }

    @PostMapping("/submit_details")
    public String submitDetails(@RequestBody ContactForm contactForm) {
       return contactFormService.saveUserDetails(contactForm);
    }
    @GetMapping("/get-all-users")
    public List<ContactFormDTO> getAllUsers() {
        return contactFormService.getAllUsers();
    }
//    @GetMapping("/schooling-details")
//    public List
}
