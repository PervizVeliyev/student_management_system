package sms.student_management_system.entity;

import lombok.*;
import sms.student_management_system.entity.enums.EducationType;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Builder
@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String groupName;

    @Enumerated(EnumType.STRING)
    private EducationType educationType;

    private Integer year;

    @ManyToOne
    @JoinColumn(name = "facultyId")
    Faculty faculty;

    @ManyToOne
    @JoinColumn(name = "qualificationId")
    Qualification qualification;

}
