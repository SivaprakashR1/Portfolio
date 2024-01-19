package com.sivaprakash.portfolio.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "education")
@Getter
@Setter
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String course;
    private String institution;
    private int completionBy;
    private Double marks;

}
