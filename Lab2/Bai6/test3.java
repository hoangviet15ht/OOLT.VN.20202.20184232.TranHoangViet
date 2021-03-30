import java.util.Scanner;

public class test3 {
    public static void array_Sort(int[] arr)
    {
        int temp = arr[0];
        for(int i = 0; i< arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap so phan tu:"); int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i = 0 ; i < a ; i++)
        {
            System.out.printf("nhap phan tu thu"+(i+1)+":");
            arr[i]= scanner.nextInt();
        }
        array_Sort(arr);
        for(int i =0 ; i<a;i++)
        {
            System.out.printf(""+arr[i]+"\n");
        }
    }
}
