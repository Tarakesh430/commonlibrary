package com.common.library.events;

import lombok.Data;

@Data
public class BaseEvent {
    private String eventType;
    private String eventSource;
}
