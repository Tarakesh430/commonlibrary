package com.common.library.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class SecurityKeys implements Serializable {
    private String apiKey;
    private String secretKey;
    private boolean isValid;
    private long lastValidatedTime;
    private long createTime;
    private long updateTime;
}
