package pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseCreateRequest {
    @NotBlank(message = "Field name cannot be empty or null")
    private String name;
    @NotBlank(message = "Field code cannot be empty or null")
    private String code;
    @NotBlank(message = "Field description cannot be empty or null")
    private String description;
    @NotNull(message = "Field duration be empty or null")
    private int duration;
    @NotNull(message = "Field theoreticalHours be empty or null")
    private int theoreticalHours;
    @NotNull(message = "Field practicalHours be empty or null")
    private int practicalHours;
    @NotNull(message = "Field totalHorus be empty or null")
    private int totalHours;
    @NotBlank(message = "Field modality cannot be empty or null")
    private String modality;
    @NotBlank(message = "Field courseType cannot be empty or null")
    private String courseType;
    @NotNull(message = "Field IdGroup cannot be null")
    private Long id_group;
}
