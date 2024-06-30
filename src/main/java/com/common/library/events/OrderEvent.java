package com.common.library.events;

import lombok.Data;

@Data
public class OrderEvent extends BaseEvent{
    private String exchangeName;
    private String orderId;
    private String walletId;
    private String userId;
    private String tradeType;
    private String stockName;
    private double quantity;
    private double price;
    private boolean isRecurring = false;
}
