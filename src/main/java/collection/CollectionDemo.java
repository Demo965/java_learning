package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args){
        //创建一个Collection集合对象
        Collection<Integer> collection = new ArrayList<>();
        //添加元素
        collection.add(1);
        collection.add(3);

        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(10);
        collection1.add(20);
        collection.addAll(collection1);
        /**获得迭代器
         * 通过迭代器对象进行遍历
         */
//        Iterator<Integer> iterator = collection1.iterator();//因为迭代结果类型都是Object类型，
//        // 所以要提醒迭代器，我需要Integer类型的结果
//        while(iterator.hasNext()){
//            Integer i = iterator.next();
//            if (i == 10){
//                iterator.remove();
//            }
//            System.out.print(i+"  ");
//        }
//        System.out.println("\n");
//        Iterator<Integer> iterator1 = collection1.iterator();//因为迭代结果类型都是Object类型，
//        // 所以要提醒迭代器，我需要Integer类型的结果
//        while(iterator1.hasNext()){
//            Integer i = iterator1.next();
//            System.out.println(i);
//        }
        /**foreach循环
         *
         */
        for(Integer i : collection){
            System.out.println(i);
        }
//        iterator.hasNext();//判断是否还有下一个元素，如果有返回true，没有返回false
//        iterator.next();//返回下一个元素
//        collection.remove(10);//移除元素10
//        Integer[] integersArray = collection.toArray(new Integer[collection.size()]);
//        for (int i = 0; i <integersArray.length ; i++) {
//            System.out.println(integersArray[i]);
//        }
//        System.out.println("集合的长度："+collection.size());//集合的长度为2
//        System.out.println("集合是否为空："+collection.isEmpty());
//        System.out.println("集合是否为空："+ (collection.size() == 0));

    }
}
