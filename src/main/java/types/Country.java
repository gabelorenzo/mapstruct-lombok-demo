package types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Country {
    UNITED_STATES("US", "United States"),
    AUSTRALIA("AU", "Australia");

    private final String iso3166CountryCode;
    private final String countryName;
}
