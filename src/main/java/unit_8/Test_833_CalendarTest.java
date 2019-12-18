package unit_8;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Test_833_CalendarTest {
    public static void main(String[] args) {
        // 设置日历的显示的地区（根据自己的需要写）
        Locale.setDefault(Locale.ENGLISH);

        // GregorianCalendar是Calendar的子类
        GregorianCalendar gc = new GregorianCalendar();
        int today = gc.get(Calendar.DAY_OF_MONTH);
        int month = gc.get(Calendar.MONTH);

        // 设置月份的起始日期为1
        gc.set(Calendar.DAY_OF_MONTH, 1);

        // 获取一周中的第几天
        int weekday = gc.get(Calendar.DAY_OF_WEEK);

        // 获取一周中的第一天
        int firstDayOfWeek = gc.getFirstDayOfWeek();
        System.out.println(firstDayOfWeek);

        // 计算月份第一行的缩进数
        int indent = 0;// 缩进数
        while (weekday != firstDayOfWeek) {
            indent++;
            gc.add(Calendar.DAY_OF_MONTH, -1);// 日期减1
            weekday = gc.get(Calendar.DAY_OF_WEEK);
        }

        // 打印星期名
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        System.out.println(weekdayNames.toString());
        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            gc.add(Calendar.DAY_OF_MONTH, 1);
            weekday = gc.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);
        System.out.println();

        // 打印日历第一行的缩进空格
        for (int i = 0; i <= indent; i++) {
            System.out.print("  ");// 两个空格
        }

        // 设置月份的起始日期为1
        gc.set(Calendar.DAY_OF_MONTH, 1);

        // 打印日期
        do {
            // 打印天数
            int day = gc.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            // 用“*”标记今天
            if (day == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            gc.add(Calendar.DAY_OF_MONTH, 1);// 天数加1
            weekday = gc.get(Calendar.DAY_OF_WEEK);

            // 打印一周后换行
            if (weekday == firstDayOfWeek) {
                System.out.println();
            }
        } while (gc.get(Calendar.MONTH) == month);// 到下个月结束

    }

}

