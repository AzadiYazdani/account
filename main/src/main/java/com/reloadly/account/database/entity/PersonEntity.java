package com.reloadly.account.database.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(catalog = "Reloadly_Person")
public class PersonEntity {

    @Id
    long id;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String identityNumber;

    @Column
    String birthPlace;
}
