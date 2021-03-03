package ua.lviv.lgs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.UnivercityRepository;
import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

@Service
public class UnivercityServiceImpl implements UnivercityService {

	@Autowired
	private UnivercityRepository univercityRepository;

	@Override
	public Univercity save(Univercity univercity) {
		return univercityRepository.saveAndFlush(univercity);
	}

	@Override
	public Univercity findById(Integer id) {
		return univercityRepository.getOne(id);
	}

	@Override
	public Univercity update(Univercity univercity) {
		return univercityRepository.save(univercity);
	}

	@Override
	public void deleteById(Integer id) {
		univercityRepository.deleteById(id);
	}

	@Override
	public List<Univercity> findAll() {
		return univercityRepository.findAll();
	}

	@Override
	public List<Univercity> findBynameOfUniversity(String nameOfUniversity) {
		return univercityRepository.findBynameOfUniversity(nameOfUniversity);
	}

	@Override
	public List<Univercity> findBylevelOfAccreditation(Integer levelOfAccreditation) {
		return univercityRepository.findBylevelOfAccreditation(levelOfAccreditation);
	}

}
