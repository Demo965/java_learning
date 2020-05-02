package PublicClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
 //       Date date = new Date();
////        date.setTime(5000);
//        date.getDay();
////        long l =1000;
////        Date date = new Date(System.currentTimeMillis());
//        System.out.println(date);//打印距离1970-1-1 0：0：0,5000毫秒的时间
//        SimpleDateFormat sdf =new SimpleDateFormat(" G yyyy年MM月dd日 a hh时mm分ss秒");
//        String formatStr = sdf.format(date);
//        System.out.println(formatStr);//2020-04-26 23:29:13
//
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd/HH/mm/ss/SSS");
//        String timec = sdf2.format(date);
//        System.out.println(timec);
        String time = "2008-08-08 20:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(time);
        System.out.println(date);

    }
}
