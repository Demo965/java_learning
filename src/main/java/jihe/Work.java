package jihe;

import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        List<Rabbit> rabbitList = new ArrayList<>();

        for (int i = 1; i <= 10 ; i++) {
            if (i == 1){
                //第一个月手动忘几个里添加一个兔子
                rabbitList.add(new Rabbit());
            }else{
                //其他每个月都让兔子进行生崽的行为
                List<Rabbit> newList = new ArrayList<>(rabbitList);
                for(Rabbit rabbit:newList){
                    //让兔子涨岁
                    rabbit.addAge();
                    //让兔子生崽
                    Rabbit sonRabbit = rabbit.son();
                    if (sonRabbit != null){
                        rabbitList.add(sonRabbit);
                    }
                }
            }
            System.out.println("第"+ i +"个月兔子的数量为"+rabbitList.size()+"对");
        }
    }

    /**
     * 兔子类
     */
    static class Rabbit{
        private int age = 1;
        /**
         * 成长的行为
         */
        public void addAge(){
            age++;
        }
        /**
         * 生崽的行为
         */
        public Rabbit son(){
            if (age >= 3) {
                return new Rabbit();
            }else {
                return null;
            }
            }
        }
    }

