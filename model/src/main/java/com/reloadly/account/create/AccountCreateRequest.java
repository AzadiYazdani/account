package com.reloadly.account.create;

import com.reloadly.account.common.AccountType;
import com.reloadly.account.common.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreateRequest {

    private Customer owner;
    private AccountType accountType;
    private Double balance;

}
