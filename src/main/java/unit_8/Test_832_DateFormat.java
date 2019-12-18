package unit_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
DateFormat类的作用
 把时间对象转化成指定格式的字符串。反之，把指定格式的字符串转化成时间对象。
 DateFormat是一个抽象类，一般使用它的的子类SimpleDateFormat类来实现。
*/

public class Test_832_DateFormat {
    public static void main(String[] args) throws ParseException {
        // new出SimpleDateFormat对象
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
        // 将时间对象转换成字符串
        String daytime = s1.format(new Date());
        System.out.println(daytime);
        System.out.println(s2.format(new Date()));
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        // 将符合指定格式的字符串转成成时间对象.字符串格式需要和指定格式一致。
        String time = "2007-10-7";
        Date date = s2.parse(time);
        System.out.println("date1: " + date);
        time = "2007-10-7 20:15:30";
        date = s1.parse(time);
        System.out.println("date2: " + date);
    }
}
