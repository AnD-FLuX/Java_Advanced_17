package ua.lviv.lgs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.domain.University;

public interface UniversityRepository extends JpaRepository<University, Integer> {

	List<University> findBynameOfUniversity(String nameOfUniversity);

	List<University> findBylevelOfAccreditation(Integer levelOfAccreditation);
}
