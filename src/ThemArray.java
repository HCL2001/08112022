import java.util.Scanner;

public class ThemArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap vao chieu dai cua mang: ");
        int n = sc.nextInt();
        System.out.print("Nhap vao vi tri can them va phan tu ");
        int vitri = sc.nextInt();
        int pt = sc.nextInt();
        int[] arr = new int[10];
        //inputArray(arr, vitri, pt);
        generateArray(arr);
        inputArray(arr, n);
        addArray(arr, vitri, pt);
        xuatArray(arr);
    }
    public static void inputArrayDemo(int[] arr, int vitri, int pt){
        for (int i = 0; i < arr.length; i++){
            if ((i + 1) == vitri){
                arr[i] = pt;
                continue;
            }else
                arr[i] = sc.nextInt();
        }
    }

    public static void generateArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }

    public static void inputArray(int[] arr, int length){
        for (int i = 0; i < arr.length; i++){
            if (i == length)
                break;
            else
                arr[i] = sc.nextInt();
        }
    }

    public static void addArray(int[] arr, int vitri, int pt){
        for (int i = arr.length - 1; i >= vitri; i--){
            arr[i] = arr[i - 1];
        }
        arr[vitri] = pt;
    }

    public static void xuatArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
