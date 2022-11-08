import java.util.Scanner;

public class MaxMultiArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        inputArray(arr);
        xuatArray(arr);
        System.out.println("Phan tu lon nhat trong mang la : " + maxArray(arr));
    }

    public static void inputArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static int maxArray(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
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
