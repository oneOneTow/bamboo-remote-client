package com.luzhiqing.bamboo.remote.client;

import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;
import com.luzhiqing.common.token.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("bamboo-auth-server")
public interface AccountRemote {


    /**
     *
     * @param appId
     * @param code
     * @return
     */
    @RequestMapping(value = "/auth/account/login/{appId}", method = RequestMethod.GET)
    TokenDTO mpLogin(@PathVariable String appId, @RequestParam String code);

    /**
     * 获取user信息
     *
     * @param appId
     * @param sessionKey
     * @param signature
     * @param rawData
     * @param encryptedData
     * @param iv
     * @return
     */
    @RequestMapping(value = "/auth/account/user/{appId}", method = RequestMethod.GET)
    User fetchUser(@PathVariable String appId,
                   @RequestParam String openId,
                   @RequestParam String signature,
                   @RequestParam String rawData,
                   @RequestParam String encryptedData,
                   @RequestParam String iv);


}
