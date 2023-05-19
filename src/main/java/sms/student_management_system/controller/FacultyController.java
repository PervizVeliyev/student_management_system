package sms.student_management_system.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sms.student_management_system.entity.Faculty;
import sms.student_management_system.repository.FacultyRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FacultyController {

    private final FacultyRepository facultyRepository;

    @GetMapping("/faculty/all")
    public List<Faculty> getAllFaculties(){
        return facultyRepository.findAll();
    }
}
