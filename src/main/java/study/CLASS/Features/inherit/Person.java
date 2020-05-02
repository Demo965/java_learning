package study.CLASS.Features.inherit;

public class Person {
//    public String name;
//    public int age;
//    public String sex;
    private String name;
    private int age;
    private String sex;



    public void displayInfo(){
        System.out.println("姓名为"+name);
        System.out.println("年龄为"+age);
        System.out.println("性别为"+sex);
    }
    public void setName(String name){
        this.name = name;//set方法
    }
    public String getName(){
        return this.name;//get方法
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(0<age && age<100 ){
            this.age = age;

        }else{
            System.out.println("年龄不合法");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
