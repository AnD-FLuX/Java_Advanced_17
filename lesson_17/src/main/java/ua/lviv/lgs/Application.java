package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UniversityService service = context.getBean(UniversityService.class);

		University university = new University();
		university.setNameOfUniversity("LvivNathFranko");
		university.setLevelOfAccreditation(8);
		university.setNumberOfInstitutes(8);
		university.setNumberOfStudents(500);
		university.setUniversityAddress("Lviv");

		service.save(university);
		
		System.out.println();
		System.out.println("     ----------- Find ALL -----------");
		System.out.println(service.findAll());
		System.out.println("     ----------- Find by ID ---------");
		System.out.println(service.findById(1));
		System.out.println("     ----------- Find By name Of University -----------");
		System.out.println(service.findBynameOfUniversity("LvivNathFranko"));
		System.out.println("     ----------- Find By level Of Accreditation -----------");
		System.out.println(service.findBylevelOfAccreditation(8));
		System.out.println("     ----------- Update -----------");
		University updateUniversity = service.findById(1);
		updateUniversity.setNumberOfStudents(999999);
		service.update(updateUniversity);
		System.out.println(service.findById(1));
		
		service.deleteById(4);
		System.out.println("     ----------- Find ALL after delete -----------");
		System.out.println(service.findAll());
		
	}
}
