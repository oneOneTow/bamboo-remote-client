package com.luzhiqing.bamboo.remote.dto;

import com.luzhiqing.bamboo.constants.enums.LoginType;
import lombok.Data;

@Data
public class LoginDTO {
    private String userName;
    private String phone;
    private String emile;
    private String password;
    private String code;
    private LoginType type;
}
