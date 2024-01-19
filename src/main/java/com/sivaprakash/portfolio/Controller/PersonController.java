package com.sivaprakash.portfolio.Controller;

import com.sivaprakash.portfolio.DTO.*;
import com.sivaprakash.portfolio.Entity.*;
import com.sivaprakash.portfolio.Service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sivaprakash")
public class PersonController {
    public ContactFormService contactFormService;

    @Autowired
    public PersonController(ContactFormService contactFormService) {
        this.contactFormService = contactFormService;
    }
//    @GetMapping("/get-certification")
//    public List<Certifications> getCertifications() {
//        return contactFormService.getCertification();
//    }
//    @GetMapping("/get-education")
//    public List<Education> getEducation() {
//        return contactFormService.getEducation();
//    }
//    @GetMapping("/get-internship")
//    public List<Internships> getInternship() {
//        return contactFormService.getInternship();
//    }
//    @GetMapping("/get-language")
//    public List<Languages> getLanguages() {
//        return contactFormService.getLanguage();
//    }
//    @GetMapping("/get-project")
//    public List<Project> getProject() {
//        return contactFormService.getProject();
//    }

    @GetMapping("/get-certification")
    public List<CertificationDTO> getCertifications() {
        return contactFormService.getCertification();
    }
    @GetMapping("/get-education")
    public List<EducationDTO> getEducation() {
        return contactFormService.getEducation();
    }
    @GetMapping("/get-internship")
    public List<InternshipDTO> getInternship() {
        return contactFormService.getInternship();
    }
    @GetMapping("/get-language")
    public List<LanguagesDTO> getLanguages() {
        return contactFormService.getLanguage();
    }
    @GetMapping("/get-project")
    public List<ProjectDTO> getProject() {
        return contactFormService.getProject();
    }

    //
    @PostMapping("/save-certification")
    public String saveCertifications(@RequestBody Certifications certifications) {
        return contactFormService.saveCertification(certifications);
    }
    @PostMapping("/save-education")
    public String saveEducation(@RequestBody Education education) {
        return contactFormService.saveEducation(education);
    }
    @PostMapping("/save-internship")
    public String saveInternship(@RequestBody Internships internships) {
        return contactFormService.saveInternship(internships);
    }
    @PostMapping("/save-language")
    public String saveLanguages(@RequestBody Languages languages) {
        return contactFormService.saveLanguage(languages);
    }
    @PostMapping("/save-project")
    public String saveProject(@RequestBody Project project) {
        return contactFormService.saveProject(project);
    }

}
