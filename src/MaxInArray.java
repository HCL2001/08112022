import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] money = new int[20];
        for (int i = 0; i < money.length; i++){
            System.out.print("Nhap tien vao: ");
            money[i] = sc.nextInt();
        }
        int max = money[0];
        for (int i = 0; i < money.length; i++){
            if (max < money[i])
                max = money[i];
        }
        System.out.print("So tien lon nhat la: " + max);
    }
}
