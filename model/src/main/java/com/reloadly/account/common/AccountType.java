package com.reloadly.account.common;

import java.util.Arrays;

public enum AccountType {

    UNDEFINED(0),
    CURRENT(1),
    SAVINGS(2),
    ;

    private final int value;

    AccountType(int value) {
        this.value = value;
    }

    public static AccountType getByValue(int input) {
        return Arrays.stream(values()).filter((accountType) -> (accountType.value == input)).findAny().orElse(null);
    }

    public int getValue() {
        return this.value;
    }

    public String getText() {
        return this.name();
    }

}
