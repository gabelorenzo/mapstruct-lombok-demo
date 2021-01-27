package dto;

import lombok.*;
import types.Language;
import types.Rating;

import java.math.BigDecimal;

@Value
public class MovieDto {
    // Fields are similar to the entity fields - MapStruct can automatically map these
    String title;
    BigDecimal budget;
    String synopsis;
    Rating rating;
    Language[] supportedLanguages;
    // Fields below will need to be mapped explicitly
    DirectorDto director;
    String releaseDate;
    String country;
    int runtimeMinutes;
}
