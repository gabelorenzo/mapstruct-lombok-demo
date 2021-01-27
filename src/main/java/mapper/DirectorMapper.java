package mapper;

import dto.DirectorDto;
import entity.DirectorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DirectorMapper {
    @Mapping(expression = "java(entity.getFirstName() + ' ' + entity.getLastName())", target = "fullName")
    @Mapping(source = "dob", target = "birthday")
    DirectorDto entityToDto(DirectorEntity entity);
}
