import dto.MovieDto;
import entity.MovieEntity;
import mapper.MovieMapper;

import java.time.LocalDate;
import java.util.UUID;

public class Application {
    public static void main(String[] args) {
        UUID movieId = UUID.randomUUID();

        MovieEntity entity = MovieEntity.builder()
                .id(movieId)
                .title("Jaws")
                .durationMinutes(120)
                .releaseDate(LocalDate.of(1980, 5, 3))
                .build();

        MovieDto dto = MovieMapper.INSTANCE.entityToDto(entity);

        System.out.println(dto.getTitle());
    }
}
