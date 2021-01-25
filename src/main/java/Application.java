import dto.MovieDto;
import entity.AddressEntity;
import entity.DirectorEntity;
import entity.MovieEntity;
import mapper.MovieMapper;
import types.Country;
import types.Language;
import types.Rating;
import types.State;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Application {
    public static void main(String[] args) {
        UUID movieId = UUID.randomUUID();

        MovieEntity entity = MovieEntity.builder()
                .id(movieId)
                .title("Jaws")
                .releaseDate(LocalDate.of(1975, 6, 20))
                .budget(BigDecimal.valueOf(7000000.00))
                .synopsis("Shark eat ppl?")
                .rating(Rating.PG)
                .supportedLanguages(new Language[] { Language.ENGLISH, Language.FRENCH })
                .director(
                        DirectorEntity.builder()
                                .id(UUID.fromString("8e11816a-5192-4234-82c7-fe67d6da3fd5"))
                                .firstName("Steven")
                                .lastName("Spielberg")
                                .dob(LocalDate.of(1946, 12, 18))
                                .build()
                )
                .address(
                        AddressEntity.builder()
                                .state(State.CALIFORNIA)
                                .country(Country.UNITED_STATES)
                                .build()
                )
                .durationMinutes(124)
                .build();

        MovieDto dto = MovieMapper.INSTANCE.entityToDto(entity);

        System.out.println(dto);
    }
}
