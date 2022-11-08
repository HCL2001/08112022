import java.util.Scanner;

public class SumMultiArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        inputArray(arr);
        xuatArray(arr);
        System.out.print("Sum array is: " + sumArray(arr));
    }

    public static void inputArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static int sumArray(int[][] arr){
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][i];

        }
        System.out.println(sum);
        for (int i = arr.length - 1; i >= 0; i--){
            sum2 += arr[arr.length-1-i][i];
        }
        System.out.println(sum2);
        return sum + sum2;
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
