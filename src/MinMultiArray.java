import java.util.Scanner;

public class MinMultiArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        inputArray(arr);
        System.out.print("So be nhat la: " + minArray(arr));
    }

    public static void inputArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static int minArray(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (min > arr[i][j])
                    min = arr[i][j];
            }
        }
        return min;
    }
}
