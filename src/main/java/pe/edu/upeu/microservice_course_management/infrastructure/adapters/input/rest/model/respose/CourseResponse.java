package pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.model.respose;

import lombok.*;
import pe.edu.upeu.microservice_course_management.domain.model.Cycle;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponse {

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
    private Cycle cycle;
}
