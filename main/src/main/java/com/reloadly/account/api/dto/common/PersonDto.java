package com.reloadly.account.api.dto.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with", toBuilder = true, access = AccessLevel.PRIVATE)
public class PersonDto {

    private String firstName;
    private String lastName;
    private String identityNumber;
    private String birthPlace;
}
