package com.huangc.base.studyservice.modules.designpattern.chuangjianxing.singleton;

/**
 * 饿汉式单例
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 * @Author: huangl
 * @Date: 2019/11/29 14:58
 * @Description:
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return  instance;
    }
}
