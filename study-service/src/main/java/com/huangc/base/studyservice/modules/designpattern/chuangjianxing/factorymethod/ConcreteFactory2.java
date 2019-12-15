package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.factorymethod;

/**
 * @Author: huangl
 * @Date: 2019/12/11 17:24
 * @Description: 具体工厂2：实现了厂品的生成方法
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
