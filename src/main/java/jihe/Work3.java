package jihe;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 如何快速去重List中的重复项
 */
public class Work3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        Set<Integer> set = new HashSet<>(list);
        for (Integer s : set)
        System.out.println(s);
    }
}
