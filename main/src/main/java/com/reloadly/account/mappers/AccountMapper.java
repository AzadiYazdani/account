package com.reloadly.account.mappers;

import com.reloadly.account.api.dto.create.AccountCreateRequestDto;
import com.reloadly.account.api.dto.create.AccountCreateResponseDto;
import com.reloadly.account.database.entity.AccountEntity;
import com.reloadly.account.create.AccountCreateRequest;
import com.reloadly.account.create.AccountCreateResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class AccountMapper {

    public abstract AccountCreateRequest to(AccountCreateRequestDto dto);

    public abstract AccountCreateResponseDto to(AccountCreateResponse dto);

    public abstract AccountCreateResponse to(AccountEntity dto);

    public abstract AccountEntity to(AccountCreateRequest request);
}
