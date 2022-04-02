package com.reloadly.account.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with", toBuilder = true, access = AccessLevel.PRIVATE)
public class Branch {
    private String name;
    private String code;
}
