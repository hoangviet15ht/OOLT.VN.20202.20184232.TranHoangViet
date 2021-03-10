import java.lang.reflect.Array;
import java.util.Arrays;

public class DayInMonth {
    private int month;
    private int year;
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int dayInMonth()
    {
        int[] x = {1,3,5,7,8,10,12};
        int[] y = {4,6,9,11};
        if(Arrays.binarySearch(x,month)>=0) return 31;
        else if(Arrays.binarySearch(y,month)>=0) return 30;
        else if (month ==2)
        {
            if(year % 4 ==0) return 29;
            else return 28;
        }
        return 0;
    }
    public boolean check()
    {
        return (month >=1 && month <=12 && year >= 1900 && year <=9999 );
    }


}
