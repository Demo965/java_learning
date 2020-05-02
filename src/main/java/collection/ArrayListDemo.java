package collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(100);//当大概知道需要添加多少个元素的时候
        arrayList.trimToSize();//让底层的数组长度和元素个数一致的数组
    }
}
