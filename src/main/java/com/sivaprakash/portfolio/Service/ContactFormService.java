package com.sivaprakash.portfolio.Service;

import com.sivaprakash.portfolio.DTO.*;
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
    public CertificationDTO convertEntityToDto(Certifications certifications) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        CertificationDTO certificationDTO = new CertificationDTO();
        certificationDTO = modelMapper.map(certifications, CertificationDTO.class);
        return certificationDTO;
    }
    public EducationDTO convertEntityToDto(Education education) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        EducationDTO educationDTO = new EducationDTO();
        educationDTO = modelMapper.map(education, EducationDTO.class);
        return educationDTO;
    }
    public InternshipDTO convertEntityToDto(Internships internships) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        InternshipDTO internshipDTO = new InternshipDTO();
        internshipDTO = modelMapper.map(internships, InternshipDTO.class);
        return internshipDTO;
    }
    public LanguagesDTO convertEntityToDto(Languages languages) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        LanguagesDTO languagesDTO = new LanguagesDTO();
        languagesDTO = modelMapper.map(languages, LanguagesDTO.class);
        return languagesDTO;
    }
    public ProjectDTO convertEntityToDto(Project project) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(project, ProjectDTO.class);
    }

    //    private ContactForm convertDtoToEntity(ContactFormDTO contactFormDTO) {
//        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
//        ContactForm contactForm = new ContactForm();
//        modelMapper.map(contactFormDTO, contactForm);
//        return contactForm;
//    }
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
    public List<CertificationDTO> getCertification() {
        List<Certifications> certifications = certificationsRepository.findAll();
        return certifications.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    public List<EducationDTO> getEducation() {
        List<Education> educations = educationRepository.findAll();
        return educations.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    public List<InternshipDTO> getInternship() {
        List<Internships> internships = internshipRepository.findAll();
        return internships.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    public List<LanguagesDTO> getLanguage() {
        List<Languages> languages = languagesRepository.findAll();
        return languages.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    public List<ProjectDTO> getProject() {
        List<Project> projects = projectRepository.findAll();
        return projects.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
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
