package com.reloadly.account.database.entity;

import com.reloadly.account.common.AccountType;
import com.reloadly.account.common.Balance;
import com.reloadly.account.common.Person;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@Builder(setterPrefix = "with", toBuilder = true, access = AccessLevel.PRIVATE)
@Table(catalog = "Reloadly_Account")
public class AccountEntity {

    @Id()
    private long id;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="OWNER_ID")
    private PersonEntity owner;

    @Column
    private String accountNumber;

    @Column
    private AccountType accountType;

    @Column
    private Balance balance;
}
