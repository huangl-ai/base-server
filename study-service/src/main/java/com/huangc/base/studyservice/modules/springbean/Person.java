package com.huangc.base.studyservice.modules.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Author: huangl
 * @Date: 2019/12/16 21:22
 * @Description:
 */
public class Person  implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String name;
    private String address;
    private String phone;
    private BeanFactory beanFactory;
    private String beanName;

    public Person(){
        System.out.println("第一步：实例化类");
        System.out.println("【构造器】调用Person的构造器实例化");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("第四步：调用BeanFactoryAware");
        System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
               this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("第三步：设置bean的名称也就是spring容器中的名称，也就是id值" + name);
        System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
        this.beanName = beanName;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：执行spring的销毁方法");
        System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后执行的方法");
        System.out.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");

    }

    // 通过<bean>的init-method属性指定的初始化方法
    public void myInit() {
        //第五步执行初始化之前执行的方法
        System.out.println("第七步：执行自己配置的初始化方法");
        System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    // 通过<bean>的destroy-method属性指定的初始化方法
    public void myDestory() {
        System.out.println("第十一步：执行自己配置的销毁方法");
        System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }

    //第八步执行初始化之后执行的方法
    public void run() {
        System.out.println("第九步：执行自身的业务方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("第二步：设置属性");
        System.out.println("【注入属性】注入属性name");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("【注入属性】注入属性address");
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        System.out.println("【注入属性】注入属性phone");
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", name=" + name + ", phone="
                         + phone + "]";
    }
}
