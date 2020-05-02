package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Work2 {
    public static void main(String[] args) {
        int n = 50;
        //创建一个队列
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            //将编号为i的人加入队列
            queue.add(new Person(i));
        }
        //模拟报数行为
        //当前报的数
        int m = 1;
        while(true){
            //如果只剩一个人，游戏结束
            if(queue.size() == 1){
                Person winner = queue.poll();
                System.out.println(winner.getNumbers()+" "+winner.getCount());
                break;
            }
            //取出队头的人
            Person p = queue.poll();
            //让它报数m
            p.setCount(m++);

            //查看该人是否被淘汰
            if(p.getCount() % 3 ==0 || p.getCount() % 10 ==3){
                //p这个人要被淘汰
                continue;
            }
            //说明p没有被淘汰
            queue.add(p);
        }
    }
}
//人类
class Person{
    //人员的编号
    private int number;

    public int getNumbers() {
        return number;
    }

    public void setNumbers(int number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //人员最后喊的数字
    private int count;
    public Person(int number){
        super();
        this.number = number;
    }
}