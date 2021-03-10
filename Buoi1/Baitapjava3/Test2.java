import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        SecondDegreeEquation secondDegreeEquation = new SecondDegreeEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap a b c cho phuong trinh ax^2+bx+c=0\n");
        System.out.printf("nhap a:");
        int a = scanner.nextInt();
        System.out.printf("nhap b:");
        int b = scanner.nextInt();
        System.out.printf("nhap c:");
        int c = scanner.nextInt();
        secondDegreeEquation.setA(a);
        secondDegreeEquation.setB(b);
        secondDegreeEquation.setC(c);
        System.out.printf(secondDegreeEquation.resolve());
    }
}
