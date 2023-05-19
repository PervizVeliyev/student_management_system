package sms.student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sms.student_management_system.entity.Faculty;
import sms.student_management_system.entity.Student;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
