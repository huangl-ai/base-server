package com.huangc.base.studyservice.modules.innerclass;

/**
 * @Author: huangl
 * @Date: 2019/12/5 16:18
 * @Description: 成员内部类
 */
public class MemberInner {

    private double radius = 0;
    public static int count =1;

    public MemberInner(double radius) {
        this.radius = radius;
    }

    private Draw getDrawInstance() {
        return new Draw();
    }

    /**
     * 如果成员内部类 Draw 用 private 修饰，则只能在外部类的内部访问，如果用 public 修饰，则任何地方都能访问；
     * 如果用 protected 修饰，则只能在同一个包下或者继承外部类的情况下访问；如果是默认访问权限，则只能在同一个包下访问
     */
    class Draw{
        /**
         * 如果要访问外部类的同名成员，需要以下面的形式进行访问：         *
         * 外部类.this.成员变量
         * 外部类.this.成员方法
         */
        private double radius = 1;
        public void drawShape(){
            System.out.println(MemberInner.this.radius);//外部类的private成员
            System.out.println(radius);  //内部类的成员
            System.out.println(count);   //外部类的静态成员
        }
    }

    public static void main(String[] args) {

        MemberInner memberInner = new MemberInner(2);

        MemberInner.Draw draw = memberInner.new Draw();

        MemberInner.Draw draw1 = memberInner.getDrawInstance();

        draw.drawShape();
        draw1.drawShape();

    }
}
