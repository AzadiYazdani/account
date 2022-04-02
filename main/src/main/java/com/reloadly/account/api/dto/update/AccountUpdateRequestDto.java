package com.reloadly.account.api.dto.update;

import com.reloadly.account.common.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class AccountUpdateRequestDto {

    private AccountType accountType;
    private double balance;
}
