package com.sivaprakash.portfolio.Service;

import com.sivaprakash.portfolio.DTO.ContactFormDTO;
import com.sivaprakash.portfolio.Entity.*;
import com.sivaprakash.portfolio.Repository.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactFormService {
        private final ContactFormRepository contactFormRepository;
        private final CertificationsRepository certificationsRepository;
        private final EducationRepository educationRepository;
        private final InternshipRepository internshipRepository;
        private final LanguagesRepository languagesRepository;
        private final ProjectRepository projectRepository;

        @Autowired
        public ContactFormService(
                ContactFormRepository contactFormRepository,
                CertificationsRepository certificationsRepository,
                EducationRepository educationRepository,
                InternshipRepository internshipRepository,
                LanguagesRepository languagesRepository,
                ProjectRepository projectRepository) {
            this.contactFormRepository = contactFormRepository;
            this.certificationsRepository = certificationsRepository;
            this.educationRepository = educationRepository;
            this.internshipRepository = internshipRepository;
            this.languagesRepository = languagesRepository;
            this.projectRepository = projectRepository;
        }


    @Autowired
    private ModelMapper modelMapper;

    public ContactFormDTO convertEntityToDto(ContactForm contactForm) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        ContactFormDTO contactFormDTO = new ContactFormDTO();
        contactFormDTO = modelMapper.map(contactForm, ContactFormDTO.class);
        return contactFormDTO;
    }

    private ContactForm convertDtoToEntity(ContactFormDTO contactFormDTO) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ContactForm contactForm = new ContactForm();
        modelMapper.map(contactFormDTO, contactForm);
        return contactForm;
    }

    public String saveUserDetails(ContactForm contactForm){
        contactFormRepository.save(contactForm);
        return "Data Saved";
    }

    public List<ContactFormDTO> getAllUsers() {
        List<ContactForm> contactForms = contactFormRepository.findAll();
        return contactForms.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    public List<Certifications> getCertification(){
        return certificationsRepository.findAll();
    }
    public List<Education> getEducation(){
        return educationRepository.findAll();
    }
    public List<Internships> getInternship(){
        return internshipRepository.findAll();
    }
    public List<Languages> getLanguage(){
        return languagesRepository.findAll();
    }
    public List<Project> getProject(){
        return projectRepository.findAll();
    }

    public String saveCertification(Certifications certifications){
        certificationsRepository.save(certifications);
        return "Data Saved";
    }
    public String saveEducation(Education education){
        educationRepository.save(education);
        return "Data Saved";
    }
    public String saveInternship(Internships internships){
        internshipRepository.save(internships);
        return "Data Saved";
    }
    public String saveLanguage(Languages languages){
        languagesRepository.save(languages);
        return "Data Saved";
    }
    public String saveProject(Project project){
        projectRepository.save(project);
        return "Data Saved";
    }
}
