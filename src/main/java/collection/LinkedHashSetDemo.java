package collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *LinkedHashSet的特点
 * 底层多了一个链表，维护插入的顺序
 * 数据不可重复，存放数据的机制和HashSet一样
 */
public class LinkedHashSetDemo {
    public static void main (String[] args){
        Set<String> set = new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add(null);
        set.add("e");
        set.add("f");
        set.add("a");
        set.add("f");
        for (String s : set){
            System.out.println(s);
        }

    }
}
