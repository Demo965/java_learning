package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
//        System.out.println(queue.peek());//返回对头元素，但不将对头元素取出队列
//        System.out.println(queue.poll());//从队列中取出对头元素
        System.out.println("------------队列----------");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
            //创建一个栈
            Deque<String> deque = new LinkedList<>();
            //将元素添加进栈中
            deque.push("a");
            deque.push("b");
            deque.push("c");
            deque.push("d");
            System.out.println("-------栈---------");
            System.out.println(deque.pop());
            //遍历栈
            System.out.println("-------遍历栈------");
            while(!deque.isEmpty()){
                System.out.println(deque.pop());
            }


        }
    }
}
