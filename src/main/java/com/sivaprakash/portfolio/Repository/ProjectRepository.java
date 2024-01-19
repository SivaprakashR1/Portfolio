package com.sivaprakash.portfolio.Repository;

import com.sivaprakash.portfolio.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
