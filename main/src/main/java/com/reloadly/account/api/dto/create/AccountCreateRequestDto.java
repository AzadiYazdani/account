package com.reloadly.account.api.dto.create;

import com.reloadly.account.api.dto.common.PersonDto;
import com.reloadly.account.common.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class AccountCreateRequestDto {

    private PersonDto owner;
    private AccountType accountType;
    private double balance;
}
