package com.huangc.servicefeign.modules.api.service.impl;

import com.huangc.servicefeign.modules.api.feign.SchedualServiceHi;
import com.huangc.servicefeign.modules.api.service.HiService;
import com.huangc.servicefeign.modules.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: huangl
 * @Date: 2019/8/19 15:35
 * @Description:
 */
@Service
public class HiServiceImpl implements HiService {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @Override
    public String sayHiFromClientOne(String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @Override
    public String sayHiFromClientTwo(String name) {
        return schedualServiceHi.sayHiFromClientTwo(name);
    }

    @Override
    public Result sayHiFromClientTwoe(String name) {
        return schedualServiceHi.sayHiFromClientTwoe(name);
    }
}
