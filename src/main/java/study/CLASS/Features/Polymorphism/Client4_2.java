package study.CLASS.Features.Polymorphism;

public class Client4_2 {
    public static void main(String[] args){
        Map2 map2 =new Map2();
        Plant sf = new SunFlower();
        Plant wd = new WandouShoter();

        map2.put(sf);
        map2.put(wd);
    }
}
