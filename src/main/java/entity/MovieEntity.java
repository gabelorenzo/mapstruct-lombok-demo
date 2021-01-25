package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import types.Language;
import types.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieEntity {
    private UUID id;
    private String title;
    private LocalDate releaseDate;
    private BigDecimal budget;
    private String synopsis;
    private Rating rating;
    private Language[] supportedLanguages;
    private DirectorEntity director;
    private AddressEntity address;
    private int durationMinutes; //
}
