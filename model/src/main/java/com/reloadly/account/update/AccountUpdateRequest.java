package com.reloadly.account.update;

import com.reloadly.account.common.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountUpdateRequest {

    private AccountType accountType;
    private double balance;
}
