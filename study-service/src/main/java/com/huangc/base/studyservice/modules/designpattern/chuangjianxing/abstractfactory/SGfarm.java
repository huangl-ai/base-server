package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.abstractfactory;

/**
 * @Author: huangl
 * @Date: 2019/12/11 17:45
 * @Description: 具体工厂：韶关农场类
 */
public class SGfarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
