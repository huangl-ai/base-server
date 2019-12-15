package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.factorymethod;

/**
 * @Author: huangl
 * @Date: 2019/12/11 17:21
 * @Description: 具体产品2：实现抽象产品中的抽象方法
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}
