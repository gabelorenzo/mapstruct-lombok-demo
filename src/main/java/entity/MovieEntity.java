package entity;

import lombok.*;
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
    // Fields below are similar to DTO fields - MapStruct can automatically map these
    @NonNull
    private UUID id;
    private String title;
    private BigDecimal budget;
    private String synopsis;
    private Rating rating;
    private Language[] supportedLanguages;
    // Fields below will need to be mapped explicitly
    private DirectorEntity director;
    private LocalDate releaseDate;
    private AddressEntity address;
    private int durationMinutes;
}
