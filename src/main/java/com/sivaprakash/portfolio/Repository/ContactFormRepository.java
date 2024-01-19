package com.sivaprakash.portfolio.Repository;

import com.sivaprakash.portfolio.Entity.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactFormRepository extends JpaRepository<ContactForm,Integer> {
}
