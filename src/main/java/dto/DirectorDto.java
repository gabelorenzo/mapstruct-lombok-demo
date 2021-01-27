package dto;

import lombok.*;

import java.time.LocalDate;

@Value
public class DirectorDto {
    String fullName;
    LocalDate birthday;
}
