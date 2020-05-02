package study.CLASS.test;

public class Person
{
    //人的姓名
    public String name;
    //人持有的书
    public Book book;

    //读书的行为
    public void readBook(){
        System.out.println(name+"在读"+book.bookName);
    }

}