package com.huangc.base.studyservice.modules.innerclass;

/**
 * 局部内部类是定义在一个方法或者一个作用域里面的类，它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内。
 * 注意: 局部内部类就像是方法里面的一个局部变量一样，是不能有 public、protected、private 以及 static 修饰符的。
 *       匿名内部类也是不能有访问修饰符和 static 修饰符的。
 * @Author: huangl
 * @Date: 2019/12/5 17:20
 * @Description: 局部内部类
 */
public class JubuInner {

    public JubuInner(){

    }

    public People getWoman(){
        class Woman extends People{   //局部内部类
            int age =0;
        }
        return new Woman();
    }
}
