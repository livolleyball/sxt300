package dateTest;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetDiffMonth {

    /**
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        System.out.println(GetDiffMonth.getMonthSpace("1982-12-8", "2012-12-12"));

    }

    /**
     *
     * @param date1 <String>
     * @param date2 <String>
     * @return int
     * @throws ParseException
     */
    public static int getMonthSpace(String date1, String date2)
            throws ParseException {

        int result = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.setTime(sdf.parse(date1));
        c2.setTime(sdf.parse(date2));

        result = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
        System.out.println(result);
        return result == 0 ? 1 : Math.abs(result);

    }

}