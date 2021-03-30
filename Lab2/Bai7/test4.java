import java.util.Scanner;

public class test4 {
    public static void input_arr(int[][] arr)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
            for(int j =0 ;j<arr[i].length;j++)
            {
                System.out.printf("nhap gia tri hang thu "+i+"cot "+j+":");
                arr[i][j] = scanner.nextInt();
            }
    }
    public static void show_arr(int[][] arr)
    {
        for(int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + "  ");
            }
            System.out.printf("\n");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap gia tri x:");
        int x = scanner.nextInt();
        System.out.printf("nhap gia tri y:");
        int y = scanner.nextInt();
        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[x][y];
        int[][] arr3 = new int[x][y];
        System.out.printf("nhap gia tri mang arr1:\n");
        input_arr(arr1);
        System.out.printf("nhap gia tri mang arr2:\n");
        input_arr(arr2);
        show_arr(arr1);
        show_arr(arr2);
        for(int i=0;i<x;i++)
            for(int j =0;j<y;j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        show_arr(arr3);
    }
}
