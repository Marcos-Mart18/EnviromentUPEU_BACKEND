package pe.edu.upeu.microservice_course_management.domain.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private Long id_group;
    private String group_number;
    private int capacity;
    private Cycle cycle;
}
