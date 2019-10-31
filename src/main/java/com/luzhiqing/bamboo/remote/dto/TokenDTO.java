package com.luzhiqing.bamboo.remote.dto;

import lombok.Data;

@Data
public class TokenDTO {
    private String token;
    private Long expiration;
}
