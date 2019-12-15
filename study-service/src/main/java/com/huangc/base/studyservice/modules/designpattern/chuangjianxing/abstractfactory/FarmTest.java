package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.abstractfactory;

/**
 * @Author: huangl
 * @Date: 2019/12/11 17:47
 * @Description:
 */
public class FarmTest {
    /**
     * 1. 模式的结构
     * 抽象工厂模式的主要角色如下。
     * 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
     * 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
     * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
     * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它 同具体工厂之间是多对一的关系
     *
     * 使用抽象工厂模式一般要满足以下条件。
     * 系统中有多个产品族，每个具体工厂创建同一族但属于不同等级结构的产品。
     * 系统一次只可能消费其中某一族产品，即同族的产品一起使用。
     *
     * 抽象工厂模式除了具有工厂方法模式的优点外，其他主要优点如下。
     * 可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
     * 当增加一个新的产品族时不需要修改原代码，满足开闭原则。
     * @param args
     */
    public static void main(String[] args) {
        Farm f;
        Animal a;
        Plant p;
//        f=new SGfarm();
        f=new SRfarm();
        a=f.newAnimal();
        p=f.newPlant();
        a.show();
        p.show();
    }
}
