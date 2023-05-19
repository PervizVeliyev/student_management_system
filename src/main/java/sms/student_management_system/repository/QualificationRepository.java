package sms.student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sms.student_management_system.entity.Qualification;

@Repository
public interface QualificationRepository extends JpaRepository<Qualification, Long> {
}
