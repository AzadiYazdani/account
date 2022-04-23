package com.reloadly.account.service;

import com.reloadly.account.database.entity.AccountEntity;
import com.reloadly.account.database.entity.CustomerEntity;
import com.reloadly.account.database.repository.AccountRepository;
import com.reloadly.account.database.repository.CustomerRepository;
import com.reloadly.account.mappers.AccountMapper;
import com.reloadly.account.create.AccountCreateRequest;
import com.reloadly.account.create.AccountCreateResponse;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import com.reloadly.account.update.AccountUpdateRequest;
import com.reloadly.account.update.AccountUpdateResponse;

@Service
@Validated
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;
    private final CustomerRepository customerRepository;
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountMapper accountMapper, CustomerRepository customerRepository, AccountRepository accountRepository) {
        this.accountMapper = accountMapper;
        this.customerRepository = customerRepository;
        this.accountRepository = accountRepository;
    }


    @Override
    public AccountCreateResponse create(AccountCreateRequest request) {
        //check validity of identity number

        //check if the person exist
        CustomerEntity customerEntity = customerRepository.findByCustomerNumber(request.getOwner().getCustomerNumber());

        if (customerEntity == null) {
            // todo
            //throw new Exception("Customer not exists");
        } else {
            //check if the account type exist for this customer
            for (AccountEntity accountEntity : customerEntity.getAccounts()) {
                if (accountEntity.getAccountType() == request.getAccountType()) {
                    // todo
//                    throw new Exception("Account Already exists");
                }
            }
        }

        AccountEntity accountEntity = accountMapper.to(request);

        //create account number
        Integer accountNumber = accountRepository.findMaxAccountNumber();
        accountEntity.setAccountNumber(accountNumber++);

        //save into db
        accountRepository.save(accountEntity);

        //return account number to the client
        return accountMapper.to(accountEntity);
    }

    @Override
    public AccountUpdateResponse update(AccountUpdateRequest accountUpdateRequest) {
        return null;
    }
}
