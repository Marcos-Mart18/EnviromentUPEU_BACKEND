package pe.edu.upeu.microservice_course_management.domain.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Long id;
    private String name;
    private String code;
    private String description;
    private int duration;
    private int theoreticalHours;
    private int practicalHours;
    private int totalHours;
    private String modality;
    private String courseType;
    private Group group;

}
