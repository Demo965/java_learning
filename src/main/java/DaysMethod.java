import utils.TimeTransUtil;

import java.util.Scanner;

public class DaysMethod
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
        System.out.println("是这一年的"+ days +"天");
    }
    public static int days(int year,int month,int day)
    {
        int monthSum = 0;
        for (int i = 1; i <= month ; i++)
        {
            switch(i)
            {
                case 4:
                case 6:
                case 9:
                case 11:
                    monthSum += 30;
                    break;
                case 2:
                    monthSum += RunYear(year)?29:28;
                    break;
                default:
                    monthSum +=31;
                    break;
            }
        }
        return monthSum + day;
    }
    public static boolean RunYear(int year)
    {
        if(year % 4 == 0 && year % 100 != 0 ||year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
