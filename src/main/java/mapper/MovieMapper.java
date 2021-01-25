package mapper;

import dto.DirectorDto;
import dto.MovieDto;
import entity.DirectorEntity;
import entity.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    @Mapping(source = "durationMinutes", target = "runtimeMinutes")
    MovieDto entityToDto(MovieEntity entity);

    DirectorDto mapDirector(DirectorEntity value);
}
