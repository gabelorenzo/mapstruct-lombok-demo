package mapper;

import dto.MovieDto;
import entity.DirectorEntity;
import entity.MovieEntity;
import org.junit.Test;
import types.Language;
import types.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import static org.junit.Assert.*;

public class MovieMapperTest {

    private final UUID movieId = UUID.randomUUID();

    @Test
    public void shouldMapEntityToDto() {
        // Create Entity
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
                        .build()
                )
                .durationMinutes(124)
                .build();

        // Convert Entity to DTO
        MovieDto dto = MovieMapper.INSTANCE.entityToDto(entity);

        // Test that the DTO was generated correctly
        assertNotNull(dto);
        assertEquals(movieId, dto.getId());
        assertEquals("Jaws", dto.getTitle());
        assertEquals("Shark eat ppl?", dto.getSynopsis());
        assertEquals(LocalDate.of(1975, 6, 20), dto.getReleaseDate());
        assertEquals(BigDecimal.valueOf(7000000.00), dto.getBudget());
        assertEquals(Rating.PG, dto.getRating());
        assertArrayEquals(new Language[] { Language.ENGLISH, Language.FRENCH }, dto.getSupportedLanguages());

        assertEquals(124, dto.getRuntimeMinutes());
    }

}
