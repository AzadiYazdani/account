package com.reloadly.account.service;

import com.reloadly.account.create.AccountCreateRequest;
import com.reloadly.account.create.AccountCreateResponse;
import com.reloadly.account.update.AccountUpdateRequest;
import com.reloadly.account.update.AccountUpdateResponse;

public interface AccountService {

    public AccountCreateResponse create(AccountCreateRequest accountCreateRequest);
    public AccountUpdateResponse update(AccountUpdateRequest accountUpdateRequest);

}
