package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**手写比较器
 * 定制排序：
 * 要求：
 */
public class TreeSetDemo2 {
    public static void main (String[]  args){
        System.out.println("-------定制排序 ------");
        //传入比较器new MyComparetor
        Set<People> set = new TreeSet<>(new MyComparator());
        set.add(new People("张三",20,3000));
        set.add(new People("李四",25,3500));
        set.add(new People("王二",22,5000));
        set.add(new People("麻子",18,3000));
        set.add(new People("赵四",26,5000));
        set.add(new People("刘能",18,8000));
        for(People s : set){
            System.out.println(s);
        }

    }
}
class MyComparator implements Comparator<People>{
    @Override
    public int compare(People o1, People o2) {
        int sort = (int) (o1.getPrice()-o2.getPrice());
        if (sort == 0){
            sort = o1.getAge()-o2.getAge();
        }
        return sort;
    }
}

class People{
    private String name;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    public People(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    private int age;
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}