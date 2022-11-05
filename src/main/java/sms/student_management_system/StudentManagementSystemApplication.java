package sms.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sms.student_management_system.entity.Student;
import sms.student_management_system.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Parviz", "Valiyev", "veliyevperviz1@gmail.com");
		Student student2 = new Student("Farid", "Valiyev", "veliyevferid1@gmail.com");
		Student student3 = new Student("Elvin", "Valiyev", "veliyevelvin1@gmail.com");

		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);
	}
}
