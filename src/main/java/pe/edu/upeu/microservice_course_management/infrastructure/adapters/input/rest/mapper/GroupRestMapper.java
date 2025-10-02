package pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pe.edu.upeu.microservice_course_management.domain.model.Group;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.model.request.GroupCreateRequest;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.model.respose.GroupResponse;

import java.util.List;

@Mapper(componentModel = "spring",unmappedSourcePolicy = ReportingPolicy.IGNORE,
uses = {CycleRestMapper.class})
public interface GroupRestMapper {
    Group toGroup(GroupCreateRequest request);
    GroupResponse toGroupResponse(Group group);
    List<GroupResponse> toGroupResponseList(List<Group> groups);
}
