package ua.lviv.lgs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.UniversityRepository;
import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityRepository universityRepository;

	@Override
	public University save(University university) {
		return universityRepository.saveAndFlush(university);
	}

	@Override
	public University findById(Integer id) {
		return universityRepository.getOne(id);
	}

	@Override
	public University update(University university) {
		return universityRepository.save(university);
	}

	@Override
	public void deleteById(Integer id) {
		universityRepository.deleteById(id);
	}

	@Override
	public List<University> findAll() {
		return universityRepository.findAll();
	}

	@Override
	public List<University> findBynameOfUniversity(String nameOfUniversity) {
		return universityRepository.findBynameOfUniversity(nameOfUniversity);
	}

	@Override
	public List<University> findBylevelOfAccreditation(Integer levelOfAccreditation) {
		return universityRepository.findBylevelOfAccreditation(levelOfAccreditation);
	}

}
