import java.util.Scanner;

public class MergeArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] mang1 = new int[6];
        int[] mang2 = new int[3];
        int[] mang3 = new int[mang1.length + mang2.length];
        inputArray(mang1);
        inputArray(mang2);
        mergeArray(mang1, mang2, mang3);
        xuatArray(mang3);
//      System.arraycopy(mang1, 0, mang3, 0, mang1.length);
//      System.arraycopy(mang2, 0, mang3, mang1.length, mang2.length);
        xuatArray(mang3);
    }

    public static void inputArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print("Nhap vao phan tu cua mang: ");
            arr[i] = sc.nextInt();
        }
    }

    public static void mergeArray(int[] arr1, int[] arr2, int[] arr3){
        for (int i = 0; i < arr2.length; i++){
            arr3[i] = arr1[i]; // 1 2 3 0 0 0
        }
        for (int i = 0; i < arr2.length; i++){
            arr3[arr1.length + i] = arr2[i]; // 1 2 3 4 5 6
        }
    }

    public static void xuatArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
