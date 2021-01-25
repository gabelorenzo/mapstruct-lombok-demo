package types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum State {
    CALIFORNIA("CA", "California"),
    CONNECTICUT("CT", "Connecticut"),
    WISCONSIN("WI", "Wisconsin");

    private final String stateAbbreviation;
    private final String stateName;
}

