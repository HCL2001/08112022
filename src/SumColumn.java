import java.util.Scanner;

public class SumColumn {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        inputArray(arr);
        xuatArray(arr);
        sumColumn(arr);
    }

    public static void inputArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print("Moi ban nhap vao phan tu mang: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void sumColumn(int[][] arr){
        System.out.print("Moi nhap vao cot muon tinh tong: ");
        int column = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[column][i];
        }
        System.out.print("Tong la: " + sum);
    }

    public static void xuatArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
