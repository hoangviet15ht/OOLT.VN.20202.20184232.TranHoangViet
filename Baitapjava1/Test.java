import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        FirstDegreeEquation firstDegreeEquation = new FirstDegreeEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap a va b cho phuong trinh ax+b=0\n");
        System.out.printf("nhap a:");
        int a = scanner.nextInt();
        System.out.printf("nhap b:");
        int b = scanner.nextInt();
        firstDegreeEquation.setA(a);
        firstDegreeEquation.setB(b);
        System.out.printf(firstDegreeEquation.resolve());
    }
}
