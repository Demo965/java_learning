package jihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * 接口必须要new实现类
 * HashSet底层是一个哈希表
 *
 * set判断元素是否一致的机制：HashCode equals
 * 首先根据元素额hashcode方法获得元素的哈希值
 * 哈希值决定该元素的放入哈希表的哪个位置
 * 如果这个位置不存在一个元素，则插入成功 
 * 如果这个位置已经存在一个元素，则将该元素和要插入的元素进行equals比较
 * 如果equals方法返回true则说明这两个元素时同一个元素，插入失败
 * 如果equals方法返回false，则说明这两个元素不是同一个元素，则HashSet会让两个元素插入同一个位置，插入成功
 *
 * 如果重写了一个类的equals方法，则应该重写该类的HashCode方法，保证两个对象的equals方法返回true的同时，他们的HashCode值也相同
 */
public class SetDemo {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("a");
//        set.add("b");
//        set.add("c");
//        set.add("d");
//
//        //遍历Set集合
//        System.out.println("--------迭代器---------");
//        Iterator<String> iterator = set.iterator();
//        while(iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//        }
//        System.out.println("--------foreach---------");
//        for(String s : set){
//            System.out.println(s);
//        }
//        System.out.println("是否存在："+set.contains("z"));
        Set<Student> stuSet = new HashSet<>();
        stuSet.add(new Student("小明",10));
        stuSet.add(new Student("小红",9));
        stuSet.add(new Student("阿花",11));
        stuSet.add(new Student("阿花",11));
        for(Student stu : stuSet){
            System.out.println(stu);
        }
    }
}
class Student{
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}