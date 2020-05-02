package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        System.out.println("-------HashMap--------");
        Map<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        map.put("d","d");
        map.put("e","e");
        map.put("f","f");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("-------LinkedHashMap--------");
        //底层有个链表，维护key的插入顺序
        Map<String,String> map1 = new LinkedHashMap<>();
        map1.put("a","a");
        map1.put("b","b");
        map1.put("c","c");
        map1.put("d","d");
        map1.put("e","e");
        map1.put("f","f");
        for (Map.Entry<String,String> entry1 : map1.entrySet()){
            System.out.println(entry1.getKey()+" "+entry1.getValue());
        }
    }
}
