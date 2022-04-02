package com.reloadly.account.mappers;

import com.reloadly.account.api.dto.create.AccountCreateRequestDto;
import com.reloadly.account.api.dto.create.AccountCreateResponseDto;
import com.reloadly.account.database.entity.AccountEntity;
import create.AccountCreateRequest;
import create.AccountCreateResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class AccountMapper {

    abstract AccountCreateRequest to(AccountCreateRequestDto dto);

    abstract AccountCreateResponseDto to(AccountCreateResponse dto);

    abstract AccountEntity to(AccountCreateRequest request);
}
