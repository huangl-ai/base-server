package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.abstractfactory;

/**
 * @Author: huangl
 * @Date: 2019/12/11 17:41
 * @Description: 具体产品：马类
 */
public class Horse implements Animal {
    @Override
    public void show() {
        System.out.println("马的show！");
    }
}
