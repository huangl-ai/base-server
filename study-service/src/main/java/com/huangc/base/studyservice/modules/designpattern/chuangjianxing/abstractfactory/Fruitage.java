package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.abstractfactory;

/**
 * @Author: huangl
 * @Date: 2019/12/11 17:43
 * @Description: 具体产品：水果类
 */
public class Fruitage implements Plant{
    @Override
    public void show() {
        System.out.println("水果的show！");
    }
}
