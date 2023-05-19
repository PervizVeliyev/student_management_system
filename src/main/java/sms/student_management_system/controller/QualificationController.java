package sms.student_management_system.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sms.student_management_system.entity.Faculty;
import sms.student_management_system.entity.Qualification;
import sms.student_management_system.repository.FacultyRepository;
import sms.student_management_system.repository.QualificationRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QualificationController {

    private final QualificationRepository qualificationRepository;

    @GetMapping("/qualifications/all")
    public List<Qualification> getAllQualifications(){
        return qualificationRepository.findAll();
    }
}
