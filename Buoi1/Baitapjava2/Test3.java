import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Heft2an heft2an = new Heft2an();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap a1:");int a1 = scanner.nextInt();
        System.out.printf("nhap a2:");int a2 = scanner.nextInt();
        System.out.printf("nhap b1:");int b1 = scanner.nextInt();
        System.out.printf("nhap b2:");int b2 = scanner.nextInt();
        System.out.printf("nhap c1:");int c1 = scanner.nextInt();
        System.out.printf("nhap c2:");int c2 = scanner.nextInt();
        heft2an.setA1(a1);
        heft2an.setA2(a2);
        heft2an.setB1(b1);
        heft2an.setB2(b2);
        heft2an.setC1(c1);
        heft2an.setC2(c2);
        System.out.printf(heft2an.resolve());
        System.out.printf("\n"+heft2an.D());

    }
}
