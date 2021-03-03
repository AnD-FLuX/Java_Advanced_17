package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.Univercity;

public interface UnivercityService {

	Univercity save(Univercity univercity);

	Univercity findById(Integer id);

	Univercity update(Univercity univercity);

	void deleteById(Integer id);
	
	List<Univercity> findAll();

	List<Univercity> findBynameOfUniversity(String nameOfUniversity);

	List<Univercity> findBylevelOfAccreditation(Integer levelOfAccreditation);
}
