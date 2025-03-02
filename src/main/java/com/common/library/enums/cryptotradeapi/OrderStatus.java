package com.common.library.enums.cryptotradeapi;

import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@Getter
public enum OrderStatus {
    OPEN("OPEN"),
    PARTIALLY_EXECUTED("PARTIALLY_EXECUTED"),
    CANCELLED("CANCELLED"),
    EXECUTED("EXECUTED"),
    EXPIRED("EXPIRED"),
    DISCARDED("DISCARDED"),
    CANCELLATION_RAISED("CANCELLATION_RAISED"),
    EXPIRATION_RAISED("EXPIRATION_RAISED");

    private final String value;

    OrderStatus(String value) {
        this.value = value;
    }

    public static OrderStatus fromString(String orderStatus) {
        return Arrays.stream(OrderStatus.values())
                .filter(status -> status.getValue().equalsIgnoreCase(orderStatus)).findFirst().orElse(null);
    }

    public static boolean in(String orderStatus) {
        return Objects.nonNull(fromString(orderStatus));
    }
}
