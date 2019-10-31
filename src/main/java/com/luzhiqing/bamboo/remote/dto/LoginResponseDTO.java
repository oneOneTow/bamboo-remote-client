package com.luzhiqing.bamboo.remote.dto;

import com.luzhiqing.bamboo.constants.enums.GenderType;
import lombok.Data;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/9 19:21
 */
@Data
public class LoginResponseDTO {
    private Integer id;
    private String userName;
    private String nickName;
    private String avatar;
    private GenderType gender;
    private TokenDTO token;
}
