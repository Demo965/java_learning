package jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合工具类-Collections
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(121);
        list.add(20);
        list.add(40);
        list.add(68);
        System.out.println("----翻转集合-----");
        Collections.reverse(list);//翻转集合
        for(Integer i : list){
            System.out.println(i);
        }
        System.out.println("----打乱集合-----");//模拟洗牌
        Collections.shuffle(list);
        for(Integer i : list){
            System.out.println(i);
        }
        System.out.println("----排序集合-----");
        Collections.sort(list);
        for(Integer i : list){
            System.out.println(i);
        }


    }
}
