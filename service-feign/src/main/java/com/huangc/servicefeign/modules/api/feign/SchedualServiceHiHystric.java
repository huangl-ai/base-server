package com.huangc.servicefeign.modules.api.feign;

import com.huangc.servicefeign.modules.common.Result;
import org.springframework.stereotype.Component;

/**
 * @Auther: huangl
 * @Date: 2019/8/19 15:32
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "a error happened "+name;
    }

    @Override
    public String sayHiFromClientTwo(String name) {
        return "a error happenedm "+name;
}

    @Override
    public Result sayHiFromClientTwoe(String name) {
        return new Result().error();
    }
}
