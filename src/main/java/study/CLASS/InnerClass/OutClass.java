package study.CLASS.InnerClass;

public class OutClass {
    public int age = 10;

    //成员内部类
    public class InnerClass {
        public int age = 15;

        public void innerMethod() {
            int age = 20;
            System.out.println(age);//局部变量
            System.out.println(this.age);//内部内的成员变量
            System.out.println(OutClass.this.age);
           // method();
        }
    }
}
