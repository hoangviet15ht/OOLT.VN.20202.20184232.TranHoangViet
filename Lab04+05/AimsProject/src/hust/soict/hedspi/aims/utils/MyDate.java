package hust.soict.hedspi.aims.utils;

public class MyDate {
    private int day;
    private int  month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(String day, String month, String year) {
        int a=0;
        String[] monthArr = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        for(int i =0;i<12;i++)
        {
            if (month.equals(monthArr[i])) a=i+1;
        }
        this.month = a;
        try {
            this.day = Integer.parseInt(day);
        }catch (Exception ex)
        {
            this.day = 0;
        }
        try {
            this.year = Integer.parseInt(year);
        }catch (Exception ex)
        {
            this.year = 0;
        }

    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

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
    public String print(){
        String[] monthArr = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        String dayStr;
        switch (this.day) {
            case 1: {
                dayStr = "1st";
                break;
            }
            case 2: {
                dayStr = "2nd";
                break;
            }
            case 3: {
                dayStr = "3rd";
                break;
            }
            default:
                dayStr = String.valueOf(this.day) + "th";
        }
        return (monthArr[this.month-1]+dayStr+this.year);
    }
    public String print(String format) {
        switch (format) {
            case "yyyy-mm-dd": {
                return(year+"-"+month+"-"+day);
            }

            case "dd-mm-yyyy": {
                return (day+"-"+month+"-"+year);
            }
            default:
            {
                return("format not valid");
            }
        }
    }
}
