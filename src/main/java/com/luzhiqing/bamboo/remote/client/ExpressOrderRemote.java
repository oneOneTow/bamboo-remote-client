package com.luzhiqing.bamboo.remote.client;

import com.luzhiqing.bamboo.remote.dto.ExpressOrderDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("bamboo-biz-server")
public interface ExpressOrderRemote {

    @RequestMapping(value = "/v1/express/order",method = RequestMethod.POST)
    ExpressOrderDTO placeOrder(@RequestBody ExpressOrderDTO expressOrder);
}
