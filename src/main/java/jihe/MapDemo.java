package jihe;

import java.util.*;

/**
 * 以键值对的形式保存元素，通过key一定能找到一个value，但是通过value不能找到key
 * key不可重复,可以为null，但是只能有一个null
 * value可重复，value可以为null，可以有多个null
 * 如果添加一个元素,key发生重复，value会覆盖（key不会）
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer , String > map = new HashMap<>();
        //添加元素
        map.put(1,"语文");
        map.put(2,"数学");
        map.put(3,"英语");
        map.put(4,"生物");
        map.put(null,"语文");
//        //获得集合长度
//        System.out.println("集合的长度："+ map.size());
//        System.out.println("key是否存在："+(map.containsKey(3)));
//        System.out.println("value是否存在："+(map.containsValue("生物")));
//        //map.putAll(map2);将另一个map集合内的元素全部放入当前map集合中
//
//        //根据key获得value
//        System.out.println("获得value："+map.get(3));
//        System.out.println("移除："+map.remove(null));
//        System.out.println("移除后的集合长度："+map.size());
//        map.clear();
//        System.out.println("清空后的集合长度："+map.size());

        /**
         * Map集合的遍历
         *
         */
        System.out.println("---------通过遍历key，再找到value--------");
        //通过KeySet获得key的Set集合
        Set<Integer> set = map.keySet();
        //迭代器
        System.out.println("----迭代器遍历------");
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key+" "+map.get(key));
        }
        //foreach
        System.out.println("-----foreach遍历------");
        for(Integer key : set){
            System.out.println(key+" "+ map.get(key));
        }
        System.out.println("----------直接遍历Map中的Entry对象------------");
        Set<Map.Entry<Integer,String>> eset = map.entrySet();
        for (Map.Entry<Integer,String> entry :eset){
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
        System.out.println("-------直接遍历value--------");
        //所有value的集合
        Collection<String> values = map.values();
        for(String value: values){
            System.out.println(value);
        }
    }
}
