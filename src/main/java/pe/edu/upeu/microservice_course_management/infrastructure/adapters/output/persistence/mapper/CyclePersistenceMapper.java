package pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.mapper;

import org.mapstruct.Mapper;
import pe.edu.upeu.microservice_course_management.domain.model.Cycle;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.entity.CycleEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CyclePersistenceMapper {

    CycleEntity toCycleEntity(Cycle cycle);
    Cycle toCycle(CycleEntity entity);
    List<Cycle> toCycleList(List<CycleEntity> entityList);

}
