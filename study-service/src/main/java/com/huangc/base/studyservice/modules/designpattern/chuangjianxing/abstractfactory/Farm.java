package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.abstractfactory;

/**
 * @Author: huangl
 * @Date: 2019/12/11 17:45
 * @Description: 抽象工厂：农场类
 */
public interface Farm {

    public Animal newAnimal();
    public Plant newPlant();
}
