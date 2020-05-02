import java.util.Scanner;

public class Work6
{
    public static void main (String[] args)
    {
        System.out.println("请输入一个正整数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        primeFactorization(n);
    }
    //分解质因数
    public static void primeFactorization(int number)
    {
        for (int i = 2;i < number ; i++)
        {
            if(number % i == 0)
            {
                //找到其中的最小质因数
                System.out.print(i+"*");
                //对另外一个因数分解质因数
                primeFactorization(number / i);
                return;
            }
        }
        System.out.println(number);
    }
}
