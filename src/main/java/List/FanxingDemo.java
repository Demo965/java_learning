package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FanxingDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i <list.size() ; i++) {
           int number =  list.get(i);
            System.out.println(number);
        }
    }
}
