package com.reloadly.account.database.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(catalog = "Reloadly_Customer")
@Getter
@Setter
@AllArgsConstructor
@Builder(setterPrefix = "with", toBuilder = true, access = AccessLevel.PRIVATE)
public class CustomerEntity {

    @Id
    private long id;

    @Column
    private String customerNumber;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String identityNumber;

    @Column
    private String birthPlace;

    @OneToMany(mappedBy = "owner")
    private List<AccountEntity> accounts;
}
