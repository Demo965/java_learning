import utils.TimeTransUtil;

import java.util.Scanner;

public class YearMethod
{
   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = input.nextInt();
        System.out.println("请输入一个月份：");
        int month = input.nextInt();
        System.out.println("请输入一个日期：");
        int day = input.nextInt();
        int days = TimeTransUtil.days(year,month,day);
        System.out.println("这一天距离1900年1月1日共"+ days +"天");
        System.out.println("这一天是周"+ (days%7+1));
    }
}