package com.sivaprakash.portfolio.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contactForm")
@Getter
@Setter
public class ContactForm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String emailId;
    private String message;
}
