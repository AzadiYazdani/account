package com.reloadly.account.service;

import create.AccountCreateRequest;
import create.AccountCreateResponse;
import update.AccountUpdateRequest;
import update.AccountUpdateResponse;

public interface AccountService {

    public AccountCreateResponse create(AccountCreateRequest accountCreateRequest);
    public AccountUpdateResponse update(AccountUpdateRequest accountUpdateRequest);

}
