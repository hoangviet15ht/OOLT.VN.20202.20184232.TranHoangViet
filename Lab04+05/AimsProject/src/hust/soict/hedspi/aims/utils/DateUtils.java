package hust.soict.hedspi.aims.utils;

public class DateUtils {
    public static int compareDate(MyDate date1, MyDate date2) {
        String dateStr1 = Integer.toString(date1.getYear())+date1.getMonth()+date1.getDay();
        String dateStr2 = Integer.toString(date1.getYear())+date1.getMonth()+date1.getDay();
        return dateStr1.compareTo(dateStr2);
    }
    public static void sortDate(MyDate []dateArr) {
        for(int i = 0; i < dateArr.length - 1; i++) {
            for(int j = i + 1; j < dateArr.length; j++) {
                if(compareDate(dateArr[i], dateArr[j]) > 0) {
                    MyDate tg = dateArr[i];
                    dateArr[i] = dateArr[j];
                    dateArr[j] = tg;
                }
            }
        }
    }
}
