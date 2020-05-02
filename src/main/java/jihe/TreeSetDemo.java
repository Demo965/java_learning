package jihe;

import java.util.Set;
import java.util.TreeSet;

/**TreeSet
 * 特点：对元素进行排序
 * TreeSet底层是一颗红-黑树（一种特殊的二叉树），依赖于红黑树的数据结构，维护元素的字典顺序
 * 则TreeSet的性能总比HashSet要差
 *
 * TreeSet判断元素是否重复的机制发生了改变（底层没有哈希表，和hashCode方法和equals方法都没有关系）
 *
 *TreeSet排序方式：
 *   自然排序 ：
 *         要求：元素必须实现java.lang.Comparable接口
 *         例：class Lstudent implements Comparable<Lstudent>
 *             重写接口中的CompareTo方法，该方法决定了排序的顺序
 *   定制排序：
 *        要求：
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Lstudent> set =  new TreeSet<>();
        set.add(new Lstudent("张三",20,3000));
        set.add(new Lstudent("李四",25,3500));
        set.add(new Lstudent("王二",22,5000));
        set.add(new Lstudent("麻子",18,3000));
        set.add(new Lstudent("赵四",26,5000));
        set.add(new Lstudent("刘能",18,8000));
        for(Lstudent l : set){
            System.out.println(l);
        }

    }
}
class Lstudent implements Comparable<Lstudent>{
    private String name ;

    @Override
    public String toString() {
        return "Lstudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    public Lstudent(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    private int age;

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

    private double price;

    /**
     * this和l比较
     * 如果返回的值大于0，则this排在l的前面
     * 如果返回的值小于0，则this排在l的后面
     * 如果返回的值等于0，则l插入失败
     * @param
     * @return
     * 收入升序
     */
    @Override
    public int compareTo(Lstudent l) {
        //按收入排序
        int sr = (int) (this.getPrice() - (l.getPrice()));
        //如果相同
        if (sr == 0){
            //按年龄排序
            sr= (this.getAge() - (l.getAge()));
        }
        return sr;
    }
}
