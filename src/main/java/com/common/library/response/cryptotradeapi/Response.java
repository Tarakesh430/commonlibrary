package com.common.library.response.cryptotradeapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T>  implements Serializable {
    T data;
    private String message;
}
