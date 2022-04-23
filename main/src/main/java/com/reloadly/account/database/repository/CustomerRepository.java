package com.reloadly.account.database.repository;

import com.reloadly.account.database.entity.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

    CustomerEntity findByCustomerNumber(String customerNumber);

    @Query(value = "SELECT max(customerNumber) FROM CustomerEntity")
    CustomerEntity findMaxCustomerNumber(int customerNumber);
}
