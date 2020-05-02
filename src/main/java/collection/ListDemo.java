package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList();
        list.add("Hello World");
        list.add("Hello Java");
        list.add("Hello List");

        //List的拓展add
        list.add(0,"Hello Girl");
//        for (String s:list) {
//            System.out.println(s);
//        }
        //list的拓展get
        String s = list.get(1);
        System.out.println(s);
        //普通佛瑞循环遍历
        System.out.println("---------普通for循环遍历-------");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
