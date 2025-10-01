package pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pe.edu.upeu.microservice_course_management.domain.model.Cycle;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.CycleRestAdapter;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.model.request.CycleCreateRequest;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.input.rest.model.respose.CycleResponse;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CycleRestMapper {
    Cycle toCycle(CycleCreateRequest request);
    CycleResponse toCycleResponse(Cycle cycle);
    List<CycleResponse> toCycleResponseList(List<Cycle> cycles);
}
