package com.sivaprakash.portfolio.DTO;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDTO {

        private int id;
        private String course;
        private String institution;
        private int completionBy;
        private Double marks;

    }


