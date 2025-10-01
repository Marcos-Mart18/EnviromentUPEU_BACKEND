package pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.mapper;

import org.mapstruct.Mapper;
import pe.edu.upeu.microservice_course_management.domain.model.Course;
import pe.edu.upeu.microservice_course_management.infrastructure.adapters.output.persistence.entity.CourseEntity;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CyclePersistenceMapper.class})
public interface CoursePersistenceMapper {

    CourseEntity toCourseEntity(Course course);
    Course toCourse(CourseEntity entity);
    List<Course> toCourseList(List<CourseEntity> entityList);

}
