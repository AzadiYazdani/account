package create;

import com.reloadly.account.common.AccountType;
import com.reloadly.account.common.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountCreateRequest {

    private Person owner;
    private AccountType accountType;
    private double balance;

}
