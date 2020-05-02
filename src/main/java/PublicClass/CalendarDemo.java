package PublicClass;


import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        //日历对象和日期对象的互转
//        System.out.println(calendar);
//
//        Date date1 = calendar.getTime();//将calendar对象所代表的时间转换成Date对象
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        int year = calendar.get(Calendar.YEAR);//获得该日历的某一属性（年，月，日）
        System.out.println("年份："+year);
        int month = calendar.get(Calendar.MONTH)+1;
        System.out.println("月份："+month);//获得的月份比当前的月份总会小1
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("日期："+date);
        int hour = calendar.get(Calendar.HOUR);//12时制
        int hour1 = calendar.get(Calendar.HOUR_OF_DAY);//24时制
        System.out.print("12时制小时："+hour+"    ");
        System.out.println("24时制小时："+hour1);
        int minute = calendar.get(Calendar.MINUTE);//24时制
        System.out.println("分钟："+minute);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("秒："+second);

        calendar.set(Calendar.YEAR,2018);
        Date date1 = calendar.getTime();
        System.out.println("年份："+date1);
 }

}
