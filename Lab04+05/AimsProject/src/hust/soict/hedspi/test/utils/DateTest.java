package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {

    public static void main(String[] args) {
        MyDate date1 = new MyDate("1","February","3");
        date1.print("yyyy-mm-dd");
        MyDate date2 = new MyDate("2","February","3");
        date2.print();
        System.out.printf("\n"+ DateUtils.compareDate(date1,date2));

    }

}
