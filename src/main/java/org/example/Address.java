package org.example;

import lombok.*;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    /**
     * Takes a postal code and checks if it is valid or not
     * @param postalCode the input postal code
     * @return if it is valid or not
     */
    public static boolean isPostalCodeValid(String postalCode) {
        //TODO : to be implemented
        return false;
    }
}
