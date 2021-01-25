package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import types.Country;
import types.State;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressEntity {
    private String street;
    private String street2;
    private State state;
    private Country country;
}
