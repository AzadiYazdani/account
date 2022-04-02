package com.reloadly.account.database.repository;

import com.reloadly.account.database.entity.CustomerEntity;
import com.reloadly.account.database.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

    CustomerEntity findByIdentityNumber(String identityNumber);
}
