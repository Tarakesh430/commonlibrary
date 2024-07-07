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
    private String orderGroupId;
    private double quantity;
    private double price;
    private double executeQuantity;
    private double executedPrice;
    private boolean isRecurring = false;
    private long intervalScheduledMillis;
}
