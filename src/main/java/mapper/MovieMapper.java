package mapper;

import dto.MovieDto;
import entity.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = { DirectorMapper.class })
public interface MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    @Mapping(source = "durationMinutes", target = "runtimeMinutes")
    @Mapping(source = "address.country.countryName", target = "country")
    MovieDto entityToDto(MovieEntity entity);
}
