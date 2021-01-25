package dto;

import lombok.*;
import types.Language;
import types.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Value
public class MovieDto {
    private String title;
    private LocalDate releaseDate;
    private BigDecimal budget;
    private String synopsis;
    private Rating rating;
    private Language[] supportedLanguages;
    private DirectorDto director;
    private String country; //
    private int runtimeMinutes; // different name than entity
    private String runtime; // field doesn't exist in entity but can be derived
}
