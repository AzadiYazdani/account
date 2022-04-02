package com.reloadly.account.api;

import com.reloadly.account.api.dto.create.AccountCreateRequestDto;
import com.reloadly.account.api.dto.create.AccountCreateResponseDto;
import com.reloadly.account.mappers.AccountMapper;
import com.reloadly.account.service.AccountService;
import create.AccountCreateRequest;
import create.AccountCreateResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
@Slf4j
public class AccountController {

    private final AccountService accountService;
    private final AccountMapper accountMapper;

    public AccountController(AccountService accountService, AccountMapper accountMapper) {
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }

    @PostMapping("/create")
    public ResponseEntity<AccountCreateResponseDto> createAccount(AccountCreateRequestDto accountCreateRequestDto){
        AccountCreateRequest accountCreateRequest = accountMapper.to(accountCreateRequestDto);
        AccountCreateResponse accountCreateResponse = accountService.create(accountCreateRequest);
        AccountCreateResponseDto responseDto = accountMapper.to(accountCreateResponse);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<AccountCreateResponseDto> updateAccount(AccountCreateRequestDto accountCreateRequestDto){
        AccountCreateRequest accountCreateRequest = accountMapper.to(accountCreateRequestDto);
        AccountCreateResponse accountCreateResponse = accountService.create(accountCreateRequest);
        AccountCreateResponseDto responseDto = accountMapper.to(accountCreateResponse);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}
