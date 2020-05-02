
import jdk.nashorn.internal.ir.LexicalContext;
//在文件的开头写以下代码
import java.util.Scanner;
public class ScannerDemo
{
    public static void main (String [] args )
    {
        //创建一个输入流对象
        Scanner input = new Scanner(System.in);
        //调用next方法获取键盘输入，content就是键盘输入的内容
        /*
        System.out.println("请输入第一个整数：");
        String content1 = input.next();
        System.out.println("请输入第二个整数：");
        String content2 = input.next();
        int i = Integer.parseInt(content1);
        int j = Integer.parseInt(content2);
        int min = i <= j?i:j;
        System.out.println("两个数中最小的是："+ min);
         */
        //换个写法
        System.out.println("请输入第一个整数：");
        int i = input.nextInt();
        System.out.println("请输入第二个整数：");
        int j = input.nextInt();
        int min = i <= j?i:j;
        System.out.println("两个数中最小的是："+ min);
        //关闭input
        input.close();

    }
}
