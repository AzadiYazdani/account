package com.reloadly.account.database.repository;

import com.reloadly.account.database.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

    PersonEntity findByIdentityNumber(String identityNumber);
}
