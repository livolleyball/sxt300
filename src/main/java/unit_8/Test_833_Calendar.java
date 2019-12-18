package unit_8;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Test_833_Calendar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CHINA);
        // 得到相关日期元素
        GregorianCalendar calendar = new GregorianCalendar(2019, 8, 19, 22, 10, 50);
        int year = calendar.get(Calendar.YEAR); // 打印：1999
        int month = calendar.get(Calendar.MONTH); // 打印：10
        int day = calendar.get(Calendar.DAY_OF_MONTH); // 打印：9
//        int day2 = calendar.get(Calendar.DATE); // 打印：9
        // 日：Calendar.DATE和Calendar.DAY_OF_MONTH同义
        int date = calendar.get(Calendar.DAY_OF_WEEK); // 打印：2
        // 星期几 这里是：1-7.周日是1，周一是2，。。。周六是7
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
//        System.out.println(day2);
        System.out.println(date);
        // 设置日期
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.YEAR, 2019);
        calendar2.set(Calendar.MONTH, Calendar.JULY); // 月份数：0-11
        calendar2.set(Calendar.DATE, 19);
        calendar2.set(Calendar.HOUR_OF_DAY, 10);
        calendar2.set(Calendar.MINUTE, 20);
        calendar2.set(Calendar.SECOND, 23);
        calendar2.getFirstDayOfWeek();
        int calendar21 = calendar2.getFirstDayOfWeek();
        System.out.println("getFirstDayOfWeek "+calendar21);

        printCalendar( calendar2);
        // 日期计算
        GregorianCalendar calendar3 = new GregorianCalendar(2019, 7, 19, 22, 10, 50);
        calendar3.add(Calendar.MONTH, -1); //
        calendar3.add(Calendar.DATE, 0); //

        printCalendar(calendar3);
        // 日历对象和时间对象转化
        Date d = calendar3.getTime();
        GregorianCalendar calendar4 = new GregorianCalendar();
        calendar4.setTime(new Date());
        long g = System.currentTimeMillis();
    }
    private static void printCalendar(Calendar calendar) {

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int date = calendar.get(Calendar.DAY_OF_WEEK) ; // 星期几
        String week = "" + ((date == 0) ? "日" : date);
        String weekmap = "" + weekMap(date);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("%d年%d月%d日,星期%s %d:%d:%d \n", year, month, day,
                weekmap, hour, minute, second);

    }
    static String weekMap (Integer in_day){
        int day=in_day;
        String weekmap = null;
        switch (day){
            case 1:
                weekmap="日";
                break;
            case 2:
                weekmap="一";
                break;

            case 3:
                weekmap="二";
                break;
            case 4:
                weekmap="三";
                break;

            case 5:
                weekmap="四";
                break;
            case 6:
                weekmap="五";
                break;

            case 7:
                weekmap="六";
                break;

        }
        return weekmap;
    }

}
