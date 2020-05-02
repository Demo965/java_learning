package study.CLASS;

public class MethodParameters {
    public static void main(String[] args){
        int i =10;
        Person p = new Person();
        p.add(i);
        System.out.println(i);
    }
}

class Person{
    public void add(int a){
        a++;
    }
}
class  Dog{
public void eat (int ... a){
    
}
        }