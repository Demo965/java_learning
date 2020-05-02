import java.util.Scanner;
public class ForEachTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请随机输入一个正整数n:");
        int n = input.nextInt();
        boolean flag = true;//设置一个标志位
        int i = 2;
        while (i<n)
        {
            if (n % i == 0)
            {
                flag = false;
                //System.out.println(n+"不是素数");
            }
            i++;
        }
        if (flag)//循环结束判断标志位是否还是true
        {
            System.out.println(n+"是素数");
        }
        else
        {
            System.out.println(n+"不是素数");
        }
        /*----for循环求素数
        for (int i = 2;i < n;i++)
        {
            if (n % i == 0)
            {
                flag = false;
            }
        }
        if(flag)
        {
            System.out.println(n+"是素数");
        }
        else
        {
            System.out.println(n+"不是素数");
        }
        input.close();---*/
    }
}