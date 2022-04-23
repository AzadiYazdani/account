package com.reloadly.account.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with", toBuilder = true, access = AccessLevel.PRIVATE)
public class Customer {

    private String CustomerNumber;
    private String firstName;
    private String lastName;
    private String identityNumber;
    private String birthPlace;
}
