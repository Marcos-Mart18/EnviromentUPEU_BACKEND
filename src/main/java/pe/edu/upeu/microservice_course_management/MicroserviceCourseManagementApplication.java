package pe.edu.upeu.microservice_course_management;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.entity.CourseEntity;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.entity.CycleEntity;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.repository.CourseRepository;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.repository.CycleRepository;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class MicroserviceCourseManagementApplication implements CommandLineRunner {

	private final CourseRepository courseRepository;
	private final CycleRepository cycleRepository;

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCourseManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// 1. Cycle

		CycleEntity cycle1 = new CycleEntity(null, "Ciclo I");
		cycle1 = cycleRepository.save(cycle1);

		List<CourseEntity> entities = Arrays.asList(
				new CourseEntity(null,"Progrmación","202310615","20 y pasas",4,2,2,4,"presencial","Obligatorio",cycle1)
		);

		courseRepository.saveAll(entities);

	}


}
