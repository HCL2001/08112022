import java.util.Scanner;

public class CountStudentPass {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        inputScore(arr);
        passedStudent(arr);
    }

    public static void inputScore(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print("Nhap diem sinh vien thu " + (i+1) + " ");
            arr[i] = sc.nextInt();
        }
    }

    public static void passedStudent(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 5)
                count++;
        }
        System.out.print("So luong sinh vien dau la: " + count);
    }
}
