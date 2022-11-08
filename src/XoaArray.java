import java.util.Scanner;

public class XoaArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Moi nhap vao chieu dai cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr);
        System.out.println("Moi nhap vao vi tri can xoa va phan tu moi: ");
        int vitri = sc.nextInt();
        int pt = sc.nextInt();
        xoaArray(arr, vitri, pt);
        xuatArray(arr);
    }

    public static void inputArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print("Nhap phan tu cua mang: ");
            arr[i] = sc.nextInt();
        }
    }

    public static void xoaArray(int[] arr, int vitri, int pt){
        for (int i = 0; i < arr.length; i++){
            if ((i + 1) == vitri)
                arr[i] = pt;
        }
    }

    public static void xuatArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
