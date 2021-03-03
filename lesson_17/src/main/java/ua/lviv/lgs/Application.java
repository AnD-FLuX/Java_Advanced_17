package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UnivercityService service = context.getBean(UnivercityService.class);

		Univercity univercity = new Univercity();
		univercity.setNameOfUniversity("LvivNathFranko");
		univercity.setLevelOfAccreditation(8);
		univercity.setNumberOfInstitutes(8);
		univercity.setNumberOfStudents(500);
		univercity.setUniversityAddress("Lviv");

		service.save(univercity);
		
		System.out.println();
		System.out.println("     ----------- Find ALL -----------");
		System.out.println(service.findAll());
		System.out.println("     ----------- Find by ID ---------");
		System.out.println(service.findById(1));
		System.out.println("     ----------- Find By name Of University -----------");
		System.out.println(service.findBynameOfUniversity("Ukraine"));
		System.out.println("     ----------- Find By level Of Accreditation -----------");
		System.out.println(service.findBylevelOfAccreditation(8));
		System.out.println("     ----------- Update -----------");
		Univercity updateUnivercity = service.findById(1);
		updateUnivercity.setNumberOfStudents(999999);
		service.update(updateUnivercity);
		System.out.println(service.findById(1));
		
		service.deleteById(4);
		System.out.println("     ----------- Find ALL after delete -----------");
		System.out.println(service.findAll());
		
	}
}
