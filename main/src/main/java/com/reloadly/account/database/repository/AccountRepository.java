package com.reloadly.account.database.repository;

import com.reloadly.account.database.entity.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity, Long> {

}
