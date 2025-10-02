package pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.mapper;

import org.mapstruct.Mapper;
import pe.edu.upeu.microservice_course_management.domain.model.Group;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.entity.GroupEntity;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CyclePersistenceMapper.class})
public interface GroupPersistenceMapper {
    GroupEntity toGroupEntity(Group group);
    Group toGroup(GroupEntity entity);
    List<Group> toGroupList(List<GroupEntity> entityList);
}
