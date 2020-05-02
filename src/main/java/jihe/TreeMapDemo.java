package jihe;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap
 * 底层是一个红-黑树，维护key的字典顺序
 *
 * 自然排序
 */
public class TreeMapDemo {
    public static void main(String[] args) {
//        Map<Integer,Integer> map = new TreeMap<>();
//        map.put(1,3);
//        map.put(6,9);
//        map.put(2,5);
//        map.put(4,6);
//        map.put(7,7);
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+"-"+entry.getValue());
//        }
        Object object = new Object();
        Map<Student, Object> map = new TreeMap<>();
        map.put(new Student(1, "张一", 19), object);
        map.put(new Student(9, "张二", 18), object);
        map.put(new Student(16, "张三", 17), object);
        map.put(new Student(10, "张四", 20), object);
        for (Map.Entry<Student, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey());
//        }
        }
    }
    //静态内部内
    private static class Student implements Comparable<Student>{
        @Override
        public String toString() {
            return "Student{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Student(int no, String name, int age) {
            this.no = no;
            this.name = name;
            this.age = age;
        }

        private int no;//学号
        private String name;//姓名
        private int age;//年龄

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
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

        public Student() {
            super();
        }

        public int compareTo(Student stu){
        return this.getNo()-stu.getNo();
        }
    }

}
