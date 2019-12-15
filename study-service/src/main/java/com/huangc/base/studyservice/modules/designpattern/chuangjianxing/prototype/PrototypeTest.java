package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.prototype;

/**
 * @Author: huangl
 * @Date: 2019/11/29 15:12
 * @Description:
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype realizetype1 = realizetype.clone();
        System.out.println("obj1==obj2?"+(realizetype==realizetype1));
    }
}
