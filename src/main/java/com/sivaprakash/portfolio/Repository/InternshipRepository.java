package com.sivaprakash.portfolio.Repository;

import com.sivaprakash.portfolio.Entity.Internships;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternshipRepository extends JpaRepository<Internships, Integer> {
}
