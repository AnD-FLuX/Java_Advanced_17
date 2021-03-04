package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.University;

public interface UniversityService {

	University save(University univercity);

	University findById(Integer id);

	University update(University univercity);

	void deleteById(Integer id);
	
	List<University> findAll();

	List<University> findBynameOfUniversity(String nameOfUniversity);

	List<University> findBylevelOfAccreditation(Integer levelOfAccreditation);
}
