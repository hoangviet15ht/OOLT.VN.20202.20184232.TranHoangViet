import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static int verify(String x)
    {
        int check =0;
        String[] a = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        String[] b = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(int i=0;i<b.length;i++)
        {
            if(x.equals(b[i])) check = i+1;
        }
        if(check ==0) {
            for(int j=0;j<a.length;j++)
            {
                if(x.equals(a[j])) check = j+1;
            }

        }
        return check;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayInMonth x =new DayInMonth();
        int year;
        String month;
        do {
            System.out.printf("nhap nam:"); year = scanner.nextInt();scanner.nextLine();
            System.out.printf("nhap thang:"); month = scanner.nextLine();
            x.setYear(year);
            x.setMonth(verify(month));
        }
        while (x.check() == false);
        System.out.printf("so ngay trong thang la:"+x.dayInMonth());

    }
}
