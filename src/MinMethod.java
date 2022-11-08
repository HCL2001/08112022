import java.util.Scanner;

public class MinMethod {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Moi ban nhap vao chieu dai cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr);
        System.out.print("Phan tu nho nhat " + minArray(arr));
    }
    public static void inputArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print("Moi ban nhap phan tu vao mang ");
            arr[i] = sc.nextInt();
        }
    }
    public static int minArray(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
}
