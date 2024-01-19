package com.sivaprakash.portfolio.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailsDTO {
    private List<CertificationDTO> certificationDTOS;
    private List<ContactFormDTO> contactFormDTOS;
    private List<EducationDTO> educationDTOS;
    private List<InternshipDTO> internshipDTOS;
    private List<LanguagesDTO> languagesDTOS;
    private List<ProjectDTO> projectDTOS;
}
