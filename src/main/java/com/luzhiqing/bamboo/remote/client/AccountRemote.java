package com.luzhiqing.bamboo.remote.client;

import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("bamboo-auth-server")
public interface AccountRemote {

    /**
     * 注册用户
     *
     * @param registerDTO
     * @return
     */
    @RequestMapping(value = "/auth/account/register",method = RequestMethod.POST)
    void register(RegisterDTO registerDTO);
}
