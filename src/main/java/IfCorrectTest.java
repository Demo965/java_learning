public class IfCorrectTest
{
    public static void main(String[] args)
    {
        int age = 60;
        if (age >20 && !(age >=40))
        {
            System.out.println("青年人");
        }
        else if (age >=40 &&!(age>=60))
        {
            System.out.println("中年人");
        }
        else if (age >= 60)
        {
            System.out.println ("老年人");
        }
    }
}
