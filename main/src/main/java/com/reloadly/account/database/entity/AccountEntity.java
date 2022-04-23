package com.reloadly.account.database.entity;

import com.reloadly.account.common.AccountType;
import com.reloadly.account.common.Balance;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with", toBuilder = true, access = AccessLevel.PRIVATE)
@Table(catalog = "Reloadly_Account")
public class AccountEntity {

    @Id()
    private long id;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="OWNER_ID")
    private CustomerEntity owner;

    @Column
    private Integer accountNumber;

    @Column
    private AccountType accountType;

    @Column
    private Double balance;
}
