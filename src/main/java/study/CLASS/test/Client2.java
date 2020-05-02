package study.CLASS.test;


/**
 * 场景类
 *
 * 创建一个人类
 * 创建一个书类
 * 表示出张三在读鬼吹灯
 */
public class Client2 {
    public static void main(String[] args){
        Person p = new Person();
        p.name = "张三";

        Book b = new Book();
        b.bookName = "鬼吹灯";
        p.book = b;

        Book b1 = new Book();
        b1.bookName = "西游记";

        //开始读书
        p.readBook();
    }
}
