package com.reloadly.account.api.dto.create;

import com.reloadly.account.api.dto.common.PersonDto;
import com.reloadly.account.common.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreateRequestDto {

    private PersonDto owner;
    private AccountType accountType;
    private double balance;
}
