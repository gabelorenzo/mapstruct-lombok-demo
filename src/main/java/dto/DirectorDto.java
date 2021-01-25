package dto;

import lombok.*;

import java.time.LocalDate;

@Value
public class DirectorDto {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
}
