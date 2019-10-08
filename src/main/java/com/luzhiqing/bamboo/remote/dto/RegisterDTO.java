package com.luzhiqing.bamboo.remote.dto;

import com.luzhiqing.bamboo.constants.enums.RegisterType;
import lombok.Data;

@Data
public class RegisterDTO {

    private String userName;

    private String phone;

    private String emile;

    private RegisterType type;

    private String code;

}
