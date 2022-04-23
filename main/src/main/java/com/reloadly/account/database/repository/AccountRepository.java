package com.reloadly.account.database.repository;

import com.reloadly.account.database.entity.AccountEntity;
import com.reloadly.account.database.entity.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity, Long> {

    @Query(value = "SELECT max(accountNumber) FROM AccountEntity")
    Integer findMaxAccountNumber();
}
