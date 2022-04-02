package com.reloadly.account.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with", toBuilder = true, access = AccessLevel.PRIVATE)
public class Balance {

    private double available;
    private double real;


}
