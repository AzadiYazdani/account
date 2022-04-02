package com.reloadly.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);

        Account source = new Account(123, 200000);
        Account dest = new Account(321, 300000);

        source.transfer(dest, 5000 );
    }

}
