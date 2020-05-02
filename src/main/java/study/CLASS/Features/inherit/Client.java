package study.CLASS.Features.inherit;

/**
 * 继承
 *
 * 语法;
 * [修饰符] class 子类类名 extends 父类类名{
 *     [类定义部分]
 * }
 */
public class Client {
    public static void main(String[] args){
        B b = new B();
        b.sleep();//调用的是子类的sleep方法

        A a =new A();
        a.sleep();//调用的是父类的sleep方法
    }
}
/**
 * 动物类
 */
class A{
    public int age;
    //行为
    public void sleep(){
        System.out.println("睡觉");
        eat();
    }
    public void eat(){
        System.out.println("吃东西");
    }
}
/**
 * 狗类
 */
class B extends A{
    @Override
    public void sleep(){
        System.out.print("耳朵贴着地面");
        super.sleep();
    }
//    public int age;
//
//    public void sleep(){
//        System.out.println("睡觉");
//    }
//    public void eat(){
//        System.out.println("吃东西");
//    }
}