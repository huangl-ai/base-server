package com.huangc.base.studyservice.modules.thread;

/**
 * @Author: huangl
 * @Date: 2019/12/4 17:45
 * @Description:
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}
