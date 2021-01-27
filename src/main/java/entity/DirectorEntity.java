package entity;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DirectorEntity {
    @NonNull
    private UUID id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private LocalDate dob;
}
