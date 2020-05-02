package study.CLASS.Features.Polymorphism;


/**
 * 多态
 * 在Java中，每个引用类型变量，都有两个类型
 * 一个编译时类型，一个运行时类型
 * 当编译时类型和运行时类型不相同时，就发生了多态
 *
 * 子类的对象赋给了父类的变量，就是多态
 *
 * 通过多态创建的对象，调用方法时实会调用子类中重写的方法，如果没有重写方法，则执行父类的方法
 * java中属性不具备多态性,把属性变成方法即可，private——设置set/get
 */
public class Client3 {
    public static void main(String[] args){
    Animal/*编译时类型*/ a = new Animal()/*运行时类型*/;//a有两个类型，此时编译型
        // 类型和运行时类型相同，不是多态
        Animal/*编译时类型*/ b = new Dog()/*运行时类型*/;/*子类的对象赋值给父类
        的变量，此时运行时类型和编译时类型不一样，就是多态*/
        Dog c = new Dog();
        b.sleep();//方法的多态性
        c.sleep();
        System.out.println(b.getAge());
    }
}

class Animal{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age =10;
    public void sleep(){
        System.out.println("睡觉");
    }
}

class Dog extends Animal {
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    private int age = 5;
    public void sleep() {
        System.out.println("耳朵贴着地睡觉");
    }
}