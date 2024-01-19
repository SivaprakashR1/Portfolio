package com.sivaprakash.portfolio.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternshipDTO {
    private int id;
    private String title;
    private String role;
    private String timePeriod;
    private String duration;
    private String companyname;
}
