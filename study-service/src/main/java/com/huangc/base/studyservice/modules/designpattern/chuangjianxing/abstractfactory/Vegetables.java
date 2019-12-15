package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.abstractfactory;

/**
 * @Author: huangl
 * @Date: 2019/12/11 17:44
 * @Description: 具体产品：蔬菜类
 */
public class Vegetables implements Plant{
    @Override
    public void show() {
        System.out.println("蔬菜的show！");
    }
}
