import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {

        System.out.println("请输入一个正整数：");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean flag = true;
        for (int n = number;;)
        {
            //第n行输出空格
            for (int k = 1;k<= number-n;k++)
            {
                System.out.print(" ");
            }
            //第n行输出星号
            for (int x =1;x<=n ; x++) {
                System.out.print("* ");
            }
                System.out.println();
                if (n==1)
                {
                    flag=false;
                }
            if (flag)
            {
                n--;
            }
            else
            {
                n++;
            }
            if (!flag && n >number)
            {
                break;
            }
        }
        input.close();
    }

}
