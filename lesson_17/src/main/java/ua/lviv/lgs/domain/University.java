package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String nameOfUniversity;

	@Column
	private Integer levelOfAccreditation;

	@Column
	private Integer numberOfInstitutes;

	@Column
	private Integer numberOfStudents;

	@Column
	private String universityAddress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameOfUniversity() {
		return nameOfUniversity;
	}

	public void setNameOfUniversity(String nameOfUniversity) {
		this.nameOfUniversity = nameOfUniversity;
	}

	public Integer getLevelOfAccreditation() {
		return levelOfAccreditation;
	}

	public void setLevelOfAccreditation(Integer levelOfAccreditation) {
		this.levelOfAccreditation = levelOfAccreditation;
	}

	public Integer getNumberOfInstitutes() {
		return numberOfInstitutes;
	}

	public void setNumberOfInstitutes(Integer numberOfInstitutes) {
		this.numberOfInstitutes = numberOfInstitutes;
	}

	public Integer getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(Integer numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getUniversityAddress() {
		return universityAddress;
	}

	public void setUniversityAddress(String universityAddress) {
		this.universityAddress = universityAddress;
	}

	@Override
	public String toString() {
		return "\n Univercity [id=" + id + ", nameOfUniversity=" + nameOfUniversity + ", levelOfAccreditation="
				+ levelOfAccreditation + ", numberOfInstitutes=" + numberOfInstitutes + ", numberOfStudents="
				+ numberOfStudents + ", universityAddress=" + universityAddress + "]";
	}

}
