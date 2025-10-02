package pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupCreateRequest {

    @NotBlank(message = "Field groupNumber cannot be empty or null")
    private String group_number;

    @NotNull(message = "Field capacity cannot be null")
    private int capacity;

    @NotNull(message = "Field inCycle cannot be null")
    private Long id_cycle;
}
