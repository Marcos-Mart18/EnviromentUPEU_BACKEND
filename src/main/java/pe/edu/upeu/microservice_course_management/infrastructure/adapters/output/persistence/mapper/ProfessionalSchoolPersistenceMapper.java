package pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.mapper;

import org.mapstruct.Mapper;
import pe.edu.upeu.microservice_course_management.domain.model.ProfessionalSchool;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.entity.ProfessionalSchoolEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProfessionalSchoolPersistenceMapper {
    ProfessionalSchoolEntity toProfessionalSchoolEntity(ProfessionalSchool professionalSchool);
    ProfessionalSchool toProfessionalSchool(ProfessionalSchoolEntity entity);
    List<ProfessionalSchool> toProfessionalSchoolList(List<ProfessionalSchoolEntity> entityList);
}
