package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.factorymethod;

/**
 * @Author: huangl
 * @Date: 2019/12/11 17:23
 * @Description: 具体工厂1：实现了产品的生成方法
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
